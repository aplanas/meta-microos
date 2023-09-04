SUMMARY = "Interface driver plugin for the libvirtd daemon"
DESCRIPTION = "The interface driver plugin for the libvirtd daemon, providing \
an implementation of the network interface APIs using the \
netcontrol library"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-interface-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "0b5dcdceb0c5a8c7697463bc7125b9a3c727e35a2aec045eace962cb4254e03d81cd2cbde23e6bfe16b7a9b1248db530f47ed7d89b7b1cf4f8828d05f714a8d3"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-interface \
libvirt-daemon-driver-interface \
libvirt-driver-interface.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnetcontrol.so.0 \
libtirpc.so.3 \
libudev.so.1 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
