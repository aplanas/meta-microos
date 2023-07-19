SUMMARY = "Secret driver plugin for the libvirtd daemon"
DESCRIPTION = "The secret driver plugin for the libvirtd daemon, providing \
an implementation of the secret key APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-secret-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "a468ff80e974d0aada50a15ad07c306e88bfd5a6bfcd943a16648db3690c9048d42876c6990ade64c0698aabcc16a7db7130b6dfc75dd09086062946bc1276cc"

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
