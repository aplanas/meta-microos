SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-controller-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "ca6ebeeaa962f9f52d8ac1cb6bae84c5d9dceb00850b4f41da359611053263d4be13aa868a93e4fc3e178a024537db521c02715370d2cefc6f83f2967b3fc8d6"

RPROVIDES:${PN} += "kubevirt-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
