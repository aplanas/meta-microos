SUMMARY = "Secret driver plugin for the libvirtd daemon"
DESCRIPTION = "The secret driver plugin for the libvirtd daemon, providing \
an implementation of the secret key APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-secret-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "039557505dd0215631a91a942e7045def1fbda3aebdd32fc793e50c70114d323cd06eee13a1464685ae781d479320a702867674ca3667d574f102b57e9280f5e"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-secret \
libvirt-daemon-driver-secret \
libvirt-driver-secret.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
