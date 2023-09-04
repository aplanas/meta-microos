SUMMARY = "Server side daemon providing libvirtd proxy"
DESCRIPTION = "Server side daemon providing functionality previously provided by \
the monolithic libvirtd"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-proxy-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "f02dd5636382906b9d96bd5e8645e56203dd6bc51bc56794dd3b7c98f26c3d188516468479aa59d7286855e55854edfee86bbaef320a841f06b36b60e72101e7"

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
