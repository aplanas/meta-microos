SUMMARY = "GObject-based library providing useful data structures - Development Files"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures."
LICENSE = "LGPL-2.1+"

PV = "0.6.6"

RPM_NAME = "libgee06-devel-0.6.6-5.28.aarch64.rpm"
RPM_HASH = "99241b3d8678b12a393998576bfe710625c39d68777ed7d77eee4be892a0c89501e638cfb252e6fc433e65c4ec8a0f40c3a466e36eada6b259b9730909954edc"

RPROVIDES:${PN} += "libgee06-devel \
libgee06-devel(aarch-64) \
pkgconfig(gee-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgee2 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
typelib-1_0-Gee-1_0"

inherit rpm
