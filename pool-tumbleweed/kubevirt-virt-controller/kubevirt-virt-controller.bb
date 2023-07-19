SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-controller-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "e85306a559a4e746b29e89f091968e5e0ea664137e1ba0dd149ce22225be80c0d3c5d2b40e58bc8098776d4810a5834c1d4c592de7b8559f47b10b42c731fde9"

RPROVIDES:${PN} += "kubevirt-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
