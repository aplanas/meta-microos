SUMMARY = "Development files for the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "totem-pl-parser-devel-3.26.6-2.8.aarch64.rpm"
RPM_HASH = "3c7f598af53aba9e99a6c06c8b4257ccc70d5708436d0cf3f939426afa67d4438ecc9e16bfa63c20b5173ea95859bdffc25c92d3d822e4a9d787d90044501eaa"

RPROVIDES:${PN} += "pkgconfig-totem-plparser \
pkgconfig-totem-plparser-mini \
totem-pl-parser-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtotem-plparser-mini18 \
libtotem-plparser18 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libarchive \
pkgconfig-libxml-2.0 \
typelib-1-0-TotemPlParser-1-0"

inherit rpm
