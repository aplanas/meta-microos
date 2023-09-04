SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-operator-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "e708376bcfdede0741a00285b4df19824f0bc8913d21e008c439cbb63345be43f615f839e24be29243e907fc7c4d65a0519ec0a4378f93c5fdecff24fa28f3d2"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
