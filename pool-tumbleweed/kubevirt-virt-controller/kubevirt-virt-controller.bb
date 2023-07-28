SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-controller-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "85d8ca05c3dd882b84dada06240f35538c9c31f1caa2068bcf57e6a6fdba01623f048b7b234e74fc30e8a25153ce3e6aee7d7cfcff5093d179f2d7d2572e87e9"

RPROVIDES:${PN} += "kubevirt-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
