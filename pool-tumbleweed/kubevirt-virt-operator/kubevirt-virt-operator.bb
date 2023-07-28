SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-operator-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "a18b33b0dde00046612285eab3555f6af53dc4f8de1fe79ca54975c3ed0f0110717e1c5266fb55691e623836b84d44cbd61939a5e3e9a6b7788d16a73cf2b2c6"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
