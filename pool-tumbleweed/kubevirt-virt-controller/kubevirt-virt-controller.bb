SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-controller-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "03f7b621357725ab44caa7f8d796754f7839a0be526e669fbc248a621239a6ffcb1d73b149216bd9c9c4899db9579ca8ae9b93df7b8aa1c1c8f6a3ca9c066e1a"

RPROVIDES:${PN} += "kubevirt-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
