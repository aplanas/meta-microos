SUMMARY = "Development files for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains development files for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libshumate-devel-1.0.3-1.3.aarch64.rpm"
RPM_HASH = "140b31cab92aa8103502d93eefc44db0471c85c7510693908c09a7cac439131e1500dd9bc385f08f6bdd0ba1e521bae930fe3dcb820e90d7397de93038fc6130"

RPROVIDES:${PN} += "libshumate-devel \
libshumate-devel(aarch-64) \
pkgconfig(shumate-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshumate-1_0-1 \
pkgconfig(cairo) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk4) \
pkgconfig(json-glib-1.0) \
pkgconfig(libprotobuf-c) \
pkgconfig(libsoup-3.0) \
pkgconfig(sqlite3) \
typelib-1_0-Shumate-1_0"

inherit rpm
