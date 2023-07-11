SUMMARY = "I/O library for dealing with structured file formats"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "libgsf-1-114-1.14.50-1.6.aarch64.rpm"
RPM_HASH = "f9f41cd5c1e6f2865530d3252477bce2c583035dc675977dd9a6482a2381c218c0182e21bba8e64df4ef458f9c0ee8aa20683899bef4754a72a145576f55c23b"

RPROVIDES:${PN} += "libgsf \
libgsf-1-114 \
libgsf-1.so.114"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
