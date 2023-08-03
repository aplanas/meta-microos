SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-controller-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "30ea2af2d7d8c16786c2193ca81554f041b4d3b3de94cf656fba26b5bae1412c53327c3424f047c3f92c56dc91ef04b3801cf68613b918a39c38088e080ced0c"

RPROVIDES:${PN} += "kubevirt-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
