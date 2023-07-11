SUMMARY = "D-Bus API binding for libvirt"
DESCRIPTION = "This package provides D-Bus API for libvirt"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libvirt-dbus-1.4.1-3.8.aarch64.rpm"
RPM_HASH = "e261fafad08ae4d266511b34be3c8ac54785e0c3d3373e026d34a3bd98c0a778b85e0f7b29cc129f418f248aec3feda5af0d9302d04578b0259513a4eafa65a8"

RPROVIDES:${PN} += "libvirt-dbus"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvirt-glib-1.0.so.0 \
libvirt.so.0 \
polkit \
user-libvirtdbus"

inherit rpm
