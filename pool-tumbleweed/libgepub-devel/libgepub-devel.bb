SUMMARY = "Development files for libgepub"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.1"

RPM_NAME = "libgepub-devel-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "3c11321ca1120d7c8af7ae41defec193d192ce2d73ac6456c0eda0cfb7dd75c1f0edbc562450d9a6a3d42451213beb5e8f849625653afcb62aa5b8b844e40f0c"

RPROVIDES:${PN} += "libgepub-devel \
pkgconfig-libgepub-0.7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgepub-0-7-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libarchive \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-webkit2gtk-4.1 \
typelib-1-0-Gepub-0-7"

inherit rpm
