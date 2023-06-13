SUMMARY = "Interface driver plugin for the libvirtd daemon"
DESCRIPTION = "The interface driver plugin for the libvirtd daemon, providing \
an implementation of the network interface APIs using the \
netcontrol library"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-interface-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "6d7cc40b539b8297897205a7f0890f954f9a7a0ff34751796dbba188d7e6da6b54cc06cfb0a30c851e03a58d1cd08585782e0c0eae660fc47aefbb383c7818b6"

RPROVIDES:${PN} += "config(libvirt-daemon-driver-interface) \
libvirt-daemon-driver-interface \
libvirt-daemon-driver-interface(aarch-64) \
libvirt_driver_interface.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnetcontrol.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit)"

inherit rpm
