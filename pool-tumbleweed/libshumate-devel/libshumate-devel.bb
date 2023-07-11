SUMMARY = "Development files for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains development files for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libshumate-devel-1.0.3-1.4.aarch64.rpm"
RPM_HASH = "d719db09ac432ff51b027c4eb4be8a0df66586d11d8ad0fe8236f5b83d23bd607a00fec86674192610829f0b79969ff63c0d9604795867db70a190f503205d1a"

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
