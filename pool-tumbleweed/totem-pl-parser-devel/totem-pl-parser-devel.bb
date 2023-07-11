SUMMARY = "Development files for the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "totem-pl-parser-devel-3.26.6-2.9.aarch64.rpm"
RPM_HASH = "a8eabf7550f2b4f2926da1e8dd319a528f22b8f81da5941b1d00f2e6d24cf987edb49fd3baba4a6400894bad9f1b51c2fbe3c6daf6e38162cdbf331546e1a622"

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
