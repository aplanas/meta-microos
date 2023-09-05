SUMMARY = "Interface driver plugin for the libvirtd daemon"
DESCRIPTION = "The interface driver plugin for the libvirtd daemon, providing \
an implementation of the network interface APIs using the \
netcontrol library"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-interface-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "094d6393e36633cfe1309176d76f15bb647a4b24738a3bedbb7a65fe1066a91de30db18c9e75b9c171f1e893b032d04faa7bf545c863fc85ca8390d533de8b39"

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
