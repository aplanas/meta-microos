SUMMARY = "Nodedev driver plugin for the libvirtd daemon"
DESCRIPTION = "The nodedev driver plugin for the libvirtd daemon, providing \
an implementation of the node device APIs using the udev \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-nodedev-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "a086e7e13e542a359bd68fab01d58493257f8ff1b551ebdefc17ccada697b16eb69fd0352d846bc9a373e4fd4e3b01bdc682064a8fe917d9e979dcd7eea0d350"

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
