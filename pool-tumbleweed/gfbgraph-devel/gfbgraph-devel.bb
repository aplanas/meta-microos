SUMMARY = "Development files for the Facebook Graph API access library"
DESCRIPTION = "A GObject library for Facebook Graph API \
 \
This package contains header and linker information."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "gfbgraph-devel-0.2.5-1.9.aarch64.rpm"
RPM_HASH = "cbc6a2c6a603e6cc10680d803bc8812dbd16d06472d48c42c324ca65a3c331ac229c1e8b42120ee26c3e4f40032991b58bdc00afabd5e3bdb4ddceacf18d6e4a"

RPROVIDES:${PN} += "gfbgraph-devel \
pkgconfig-libgfbgraph-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgfbgraph-0-2-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-goa-1.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-2.4 \
pkgconfig-rest-0.7 \
typelib-1-0-GFBGraph-0-2"

inherit rpm
