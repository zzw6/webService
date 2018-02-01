/**
 * ArrayOfWorkflowBaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class ArrayOfWorkflowBaseInfo  implements java.io.Serializable {
    private com.WorkflowBaseInfo[] workflowBaseInfo;

    public ArrayOfWorkflowBaseInfo() {
    }

    public ArrayOfWorkflowBaseInfo(
           com.WorkflowBaseInfo[] workflowBaseInfo) {
           this.workflowBaseInfo = workflowBaseInfo;
    }


    /**
     * Gets the workflowBaseInfo value for this ArrayOfWorkflowBaseInfo.
     * 
     * @return workflowBaseInfo
     */
    public com.WorkflowBaseInfo[] getWorkflowBaseInfo() {
        return workflowBaseInfo;
    }


    /**
     * Sets the workflowBaseInfo value for this ArrayOfWorkflowBaseInfo.
     * 
     * @param workflowBaseInfo
     */
    public void setWorkflowBaseInfo(com.WorkflowBaseInfo[] workflowBaseInfo) {
        this.workflowBaseInfo = workflowBaseInfo;
    }

    public com.WorkflowBaseInfo getWorkflowBaseInfo(int i) {
        return this.workflowBaseInfo[i];
    }

    public void setWorkflowBaseInfo(int i, com.WorkflowBaseInfo _value) {
        this.workflowBaseInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfWorkflowBaseInfo)) return false;
        ArrayOfWorkflowBaseInfo other = (ArrayOfWorkflowBaseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowBaseInfo==null && other.getWorkflowBaseInfo()==null) || 
             (this.workflowBaseInfo!=null &&
              java.util.Arrays.equals(this.workflowBaseInfo, other.getWorkflowBaseInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWorkflowBaseInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowBaseInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowBaseInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfWorkflowBaseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.workflow.weaver", "ArrayOfWorkflowBaseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowBaseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.workflow.weaver", "WorkflowBaseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.workflow.weaver", "WorkflowBaseInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
