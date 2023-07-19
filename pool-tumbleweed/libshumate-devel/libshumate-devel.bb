SUMMARY = "Development files for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains development files for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "libshumate-devel-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "f10b452c39d8ba4a6d9693f43b8e5549aaefc331329ef0e34550fef24d9d7d7e55318c6b2b4c63fe2cc45c84097b8744a007651e7791a59b094510d3c536d6ec"

RPROVIDES:${PN} += "libshumate-devel \
pkgconfig-shumate-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshumate-1-0-1 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-json-glib-1.0 \
pkgconfig-libprotobuf-c \
pkgconfig-libsoup-3.0 \
pkgconfig-sqlite3 \
typelib-1-0-Shumate-1-0"

inherit rpm
