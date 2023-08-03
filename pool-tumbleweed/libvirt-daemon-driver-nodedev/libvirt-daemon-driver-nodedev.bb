SUMMARY = "Nodedev driver plugin for the libvirtd daemon"
DESCRIPTION = "The nodedev driver plugin for the libvirtd daemon, providing \
an implementation of the node device APIs using the udev \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-nodedev-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "ad745ddd5a7208f63358bc1a303a408a6b08795bbe1f75d18a9e0aa9b20fe0624bb5c851c2f6a253fbcee46ceb040e2c4440e04863b3295b002f24d4247ad4fe"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nodedev \
libvirt-driver-nodedev.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpciaccess.so.0 \
libtirpc.so.3 \
libudev.so.1 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
mdevctl \
modutils"

inherit rpm
