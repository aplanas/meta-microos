SUMMARY = "Server side daemon providing libvirtd proxy"
DESCRIPTION = "Server side daemon providing functionality previously provided by \
the monolithic libvirtd"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-proxy-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "af71f2d23ae8f9176b0ed96138dce38d676f810c7296151c0ead49ab1cc9f1ce5ccddd9849ef6b6c0a8719961fa24165361bf55412be345c304facd58cf8a293"

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
