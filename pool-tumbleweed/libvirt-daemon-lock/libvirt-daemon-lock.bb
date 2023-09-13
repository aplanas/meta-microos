SUMMARY = "Server side daemon for managing locks"
DESCRIPTION = "Server side daemon used to manage locks held against virtual machine \
resources"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-lock-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "b3e83357c3481e1e0df7efd85a67e9ea59f34019be8b98d32ac794b73dfb5c5d3f8f5c78d96800a21a8fdc51e65f5f5a13d92a12b64a216b1685b5c5491ace13"

RPROVIDES:${PN} += "config-libvirt-daemon-lock \
libvirt-daemon-lock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
