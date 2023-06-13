SUMMARY = "Nodedev driver plugin for the libvirtd daemon"
DESCRIPTION = "The nodedev driver plugin for the libvirtd daemon, providing \
an implementation of the node device APIs using the udev \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-nodedev-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "623bab71bbc73cd20cb7cc32c89945afa0801931174710ec65a99d68ccbe0e9ee60e08d352a8296e4b91095a5b83988e86134c13e922e4c0435ab64f3ca897d8"

RPROVIDES:${PN} += "config(libvirt-daemon-driver-nodedev) \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nodedev(aarch-64) \
libvirt_driver_nodedev.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpciaccess.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
mdevctl \
modutils"

inherit rpm
