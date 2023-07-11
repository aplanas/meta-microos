SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-operator-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "7aaee0dafd63f4c21c330cd15a78692aa3ba805ebd5868fc89254a1a0d074563feb3798a1b574f32288193d858f1007ec5f4fa84ea54ea2da4c5283122bddaeb"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
