SUMMARY = "Nodedev driver plugin for the libvirtd daemon"
DESCRIPTION = "The nodedev driver plugin for the libvirtd daemon, providing \
an implementation of the node device APIs using the udev \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-nodedev-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "623bab71bbc73cd20cb7cc32c89945afa0801931174710ec65a99d68ccbe0e9ee60e08d352a8296e4b91095a5b83988e86134c13e922e4c0435ab64f3ca897d8"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nodedev \
libvirt-driver-nodedev.so"

RDEPENDS:${PN} += "/bin/sh \
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
