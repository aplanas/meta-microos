SUMMARY = "GObject Introspection Tools"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "gobject-introspection-1.76.1-2.2.aarch64.rpm"
RPM_HASH = "1aed6d4131f2fd7647c30e991eb34023cfcb9697b7660b00013afbecf16e49bfc504869151c81a18ccd94e022884fc7eb84123aff2391a58d54559fec6e3e9b0"

RPROVIDES:${PN} += "gobject-introspection"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
file \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgio-2.0.so.0 \
libgirepository-1-0-1 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
pcre2-tools \
python-abi \
python3-xml"

inherit rpm
