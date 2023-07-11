SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-launcher-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "152feff705cae7034d9b2262724c0d60132aa121d3f01fcd4b0e6276a57a31772c09c312b241aec3e55264797750174be1b9734a2b55079e5a566d57dcc1cc25"

RPROVIDES:${PN} += "kubevirt-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
