SUMMARY = "Development headers for libsignon-glib"
DESCRIPTION = "GLib-based client library for applications handling account \
authentication through the Online Accounts Single Sign-On service \
 \
This package provides development headers for libsignon-glib."
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "libsignon-glib-devel-2.1-1.17.aarch64.rpm"
RPM_HASH = "469f17971dc764eb2312d39796267fda74e75dd4668c0c4b9c75267b1b35700947989b78bcb207d9c75a1ca3673a1d268a2b0e617fcd62b203cd380deb20ff03"

RPROVIDES:${PN} += "libsignon-glib-devel \
libsignon-glib-devel(aarch-64) \
pkgconfig(libsignon-glib)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-glib2 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
