SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-controller-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "fbfdb5c94ae408b68beced1a98ce1f184e348ec22973667ba8c5b3bcc64f89ab6c6771d13fbfa95b7298a98d18e9fbb03430cb65f7c6d305d1caf1168c9c7cd2"

RPROVIDES:${PN} += "kubevirt-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
