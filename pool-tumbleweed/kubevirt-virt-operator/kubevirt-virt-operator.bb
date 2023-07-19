SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-operator-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "239fc72e7c4a845d6caed7f6c29c31b9efe7d7d9cbd4f6dbe78386c36c385b045099e05f867a96b149f17fb189e9e37ede4150415b3e6ea259b2208181347072"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
