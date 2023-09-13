SUMMARY = "Interface driver plugin for the libvirtd daemon"
DESCRIPTION = "The interface driver plugin for the libvirtd daemon, providing \
an implementation of the network interface APIs using the \
netcontrol library"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-interface-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "a280ebe52ff6331aa4f190f8994d70388950d98c9c2a758cc84834ae84c9bc78f60851053ea67259bd63edfef25d05c5e4927e2672ad06ab14ae1db57a9ebc51"

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
