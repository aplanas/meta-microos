SUMMARY = "Development files for libgepub"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "libgepub-devel-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "3ced4e5ab128c24fb01fffa23b8c770043cfe28e22a66c00eb9333f35aa37678f963dfc1b3af50b2ebe7b00499dc1f7571d4bce062bb808815f9aae6106279ab"

RPROVIDES:${PN} += "libgepub-devel \
libgepub-devel(aarch-64) \
pkgconfig(libgepub-0.7)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgepub-0_7-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libarchive) \
pkgconfig(libsoup-3.0) \
pkgconfig(libxml-2.0) \
pkgconfig(webkit2gtk-4.1) \
typelib-1_0-Gepub-0_7"

inherit rpm
