SUMMARY = "Development files for libgdata, a library for accessing online service APIs"
DESCRIPTION = "libgdata is a GLib-based library for accessing online service APIs using \
the GData protocol. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgdata."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "libgdata-devel-0.18.1-3.4.aarch64.rpm"
RPM_HASH = "02d74e4e264be380191c73976b3d90ceb8c59ed34b7406eb6423b2c32ef1e5b8e7cc70e7e5b6569e9f61411d20ee4e1860bbe3f9f92f301ef789c5afa0550636"

RPROVIDES:${PN} += "libgdata-devel \
pkgconfig-libgdata"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdata22 \
pkgconfig-gcr-4 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-goa-1.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-2.4 \
pkgconfig-libxml-2.0 \
typelib-1-0-GData-0-0"

inherit rpm
