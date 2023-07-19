SUMMARY = "Server side daemon providing libvirtd proxy"
DESCRIPTION = "Server side daemon providing functionality previously provided by \
the monolithic libvirtd"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-proxy-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "bdb7fbf286780f8ea9e1fdd7465bd1085d959d8e21ffb4a6c356995e6d4309e29c149746e9e2535c0de58635bfc2f372caaae7ba1d16b7f4e64efb7fdcc74759"

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
