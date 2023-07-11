SUMMARY = "GTK+ binding for librep Lisp environment"
DESCRIPTION = "This is a binding of GTK+ for the rep Lisp system. It is based on \
Marius Vollmer's guile-gtk binding (initially version 0.15, updated to \
0.17), with a new glue-code generator."
LICENSE = "GPL-2.0+"

PV = "0.90.8.2"

RPM_NAME = "rep-gtk-0.90.8.2-1.31.aarch64.rpm"
RPM_HASH = "692c42529315c5e3991701506c84460562dc33bef2613d0003e39f636ea1cd955bee7d5554de16b3743fc9eabbfccf2b59ce6a35cce2fef9eb1368ac8bc8002b"

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
