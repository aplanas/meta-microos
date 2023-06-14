SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-operator-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "4f0eff8d379a5085016df18d5f8e8768d1919c24fadda180e82f19f6e00fad44337ebff38f7f0fbc999bf892ec11ddeb090fb6e5a8669bb16aa1fd00142daef8"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
