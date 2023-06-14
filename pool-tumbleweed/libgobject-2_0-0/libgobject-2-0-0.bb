SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "libgobject-2_0-0-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "412614c0216f95102a9df3d7098e6767d202442b08761057e3c988e3360308e8c300ec183277ded50dea25405544a053b629bd4411abaac86866e8167924d98f"

RPROVIDES:${PN} += "libgobject-2-0-0 \
libgobject-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libglib-2.0.so.0"

inherit rpm
