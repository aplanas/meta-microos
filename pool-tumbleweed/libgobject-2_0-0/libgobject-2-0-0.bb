SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "libgobject-2_0-0-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "fc208accbd42f22e5846ee82664814756e5c380e6bb7087a3633986f246198d40625797ae8a9d807fe68f8f2aefea79d8e83b24a12759721f871966eb89d4392"

RPROVIDES:${PN} += "libgobject-2-0-0 \
libgobject-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libglib-2.0.so.0"

inherit rpm
