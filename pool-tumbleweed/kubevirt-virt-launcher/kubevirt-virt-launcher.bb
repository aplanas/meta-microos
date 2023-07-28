SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-launcher-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "2d833c4974cabca63d5ad1a5a74726133f6a21084d194f96380e8a323b6b771006537e40949f2af8dbaad238f9d062fbffb29d713ebca3f400630a86a699cf40"

RPROVIDES:${PN} += "kubevirt-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
