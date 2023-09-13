SUMMARY = "Nodedev driver plugin for the libvirtd daemon"
DESCRIPTION = "The nodedev driver plugin for the libvirtd daemon, providing \
an implementation of the node device APIs using the udev \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-nodedev-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "cda2f9fbd6498012c23b40901b5a1fb690406aa6e26a170bd42609523d511f35238c8cd6f54eae3746c857761cfafe90f721a4aa954a3eb6f17e3b8822973ea7"

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
