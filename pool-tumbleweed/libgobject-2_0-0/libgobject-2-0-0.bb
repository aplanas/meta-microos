SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "libgobject-2_0-0-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "520f97fefd22e66d86bbbafc7de892107b48240058c074bbd12b493244b5f34fcad3273e3d2961ade4475864cff339c8d6dbc68f65e69490941c6dc8fa0ad2dc"

RPROVIDES:${PN} += "libgobject-2-0-0 \
libgobject-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libglib-2.0.so.0"

inherit rpm
