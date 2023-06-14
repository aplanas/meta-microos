SUMMARY = "GObject Introspection Tools"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "gobject-introspection-1.76.1-2.1.aarch64.rpm"
RPM_HASH = "7f355f85540e127f19eab60dea1c82840442244b8b16195aaa5dd4758836e39662887cb3b915a3ee7027500aef891ce4516306b67ca74c98ad39eba4ae7eae8a"

RPROVIDES:${PN} += "gobject-introspection"

RDEPENDS:${PN} += "/bin/bash \
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
