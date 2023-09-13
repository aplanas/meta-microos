SUMMARY = "Server side daemon providing libvirtd proxy"
DESCRIPTION = "Server side daemon providing functionality previously provided by \
the monolithic libvirtd"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-proxy-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "31c260e1851778a2c900ea99e26eb892c1363e6370f5a2a808e51a7b6aa91af9fd8bba8944f01d09c5a4390b22b276a983f70d4731f68e2c0d0b05e3cba00c84"

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
