SUMMARY = "Development files for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains development files for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libshumate-devel-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "01af562b023213bb883e3c927c9256380d5c0b413cbe587c1b6dbe14319e897e90a30b91c96a056b689923d04e08635bec958c96cb7275cdceaa5d6857bbe24f"

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
