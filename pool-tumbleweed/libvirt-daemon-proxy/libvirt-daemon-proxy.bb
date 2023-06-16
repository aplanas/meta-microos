SUMMARY = "Server side daemon providing libvirtd proxy"
DESCRIPTION = "Server side daemon providing functionality previously provided by \
the monolithic libvirtd"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-proxy-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "e5e787f0bad4a7a7b7850daaf6fb6046914057b1d8d9e6b95e7a81c376e325eb435606ca5664a0aee782f0d17c28a819cfd0d86c39cd83f990cbdba7bfb4e3b6"

RPROVIDES:${PN} += "config-libvirt-daemon-proxy \
libvirt-daemon-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
