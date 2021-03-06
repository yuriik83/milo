/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 * 	http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * 	http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.server.model.variables;

import java.util.Optional;

import org.eclipse.milo.opcua.sdk.core.model.variables.MultiStateValueDiscreteType;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableTypeNode;
import org.eclipse.milo.opcua.sdk.server.api.UaNodeManager;
import org.eclipse.milo.opcua.sdk.server.util.UaVariableNode;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumValueType;

@UaVariableNode(typeName = "0:MultiStateValueDiscreteType")
public class MultiStateValueDiscreteNode extends DiscreteItemNode implements MultiStateValueDiscreteType {

    public MultiStateValueDiscreteNode(
        UaNodeManager nodeManager,
        NodeId nodeId,
        VariableTypeNode variableTypeNode) {

        super(nodeManager, nodeId, variableTypeNode);
    }

    public MultiStateValueDiscreteNode(
        UaNodeManager nodeManager,
        NodeId nodeId,
        QualifiedName browseName,
        LocalizedText displayName,
        Optional<LocalizedText> description,
        Optional<UInteger> writeMask,
        Optional<UInteger> userWriteMask,
        DataValue value,
        NodeId dataType,
        Integer valueRank,
        Optional<UInteger[]> arrayDimensions,
        UByte accessLevel,
        UByte userAccessLevel,
        Optional<Double> minimumSamplingInterval,
        boolean historizing) {

        super(nodeManager, nodeId, browseName, displayName, description, writeMask, userWriteMask,
            value, dataType, valueRank, arrayDimensions, accessLevel, userAccessLevel, minimumSamplingInterval, historizing);
    }


    @Override
    public EnumValueType[] getEnumValues() {
        Optional<EnumValueType[]> property = getProperty(MultiStateValueDiscreteType.ENUM_VALUES);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getEnumValuesNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(MultiStateValueDiscreteType.ENUM_VALUES.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setEnumValues(EnumValueType[] value) {
        setProperty(MultiStateValueDiscreteType.ENUM_VALUES, value);
    }

    @Override
    public LocalizedText getValueAsText() {
        Optional<LocalizedText> property = getProperty(MultiStateValueDiscreteType.VALUE_AS_TEXT);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getValueAsTextNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(MultiStateValueDiscreteType.VALUE_AS_TEXT.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setValueAsText(LocalizedText value) {
        setProperty(MultiStateValueDiscreteType.VALUE_AS_TEXT, value);
    }

}
