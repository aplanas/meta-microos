SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-operator-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "49ec9daf783a97ca87a075354f90f4a3bc1423729779f669efdfa95403614459692738250db2c39c53acb7e22906eea0c97ced0c3172803cc6a638e90efa3700"

RPROVIDES:${PN} += "kubevirt-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
