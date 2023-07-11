SUMMARY = "GTK+ binding for librep Lisp environment - Development Files"
DESCRIPTION = "This is a binding of GTK+ for the rep Lisp system. It is based on \
Marius Vollmer's guile-gtk binding (initially version 0.15, updated to \
0.17), with a new glue-code generator."
LICENSE = "GPL-2.0+"

PV = "0.90.8.2"

RPM_NAME = "rep-gtk-devel-0.90.8.2-1.31.aarch64.rpm"
RPM_HASH = "c1782cf1ab17a9aee5ad8719d586f24b82d5fa9f1f57919bb561f2c41bdcc14b0056a28133ec3e4160fb7366a43dfb930c6dcfa4e576068141a366adb325c95b"

RPROVIDES:${PN} += "pkgconfig-rep-gtk \
rep-gtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-librep \
rep-gtk"

inherit rpm
