SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-launcher-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "61f6d814bf0a0ca83dd217710f9fa944fc6da896223377a015bd6efa78d562c74d8202c2e8901edd144f48c9ce87e78e1463edd8feb3839c2ef9f75f8c2f5aed"

RPROVIDES:${PN} += "kubevirt-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
