SUMMARY = "GTK+ binding for librep Lisp environment"
DESCRIPTION = "This is a binding of GTK+ for the rep Lisp system. It is based on \
Marius Vollmer's guile-gtk binding (initially version 0.15, updated to \
0.17), with a new glue-code generator."
LICENSE = "GPL-2.0+"

PV = "0.90.8.2"

RPM_NAME = "rep-gtk-0.90.8.2-1.30.aarch64.rpm"
RPM_HASH = "a330f96bcf0dd7e03a32ca911c515614c5ed6e2abbec641a685c799f9d8a93db276c18233c95e7b3fdfb53ae6336abade728f023258e887425d80ab8c32ac3f6"

RPROVIDES:${PN} += "rep-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
