SUMMARY = "A Library for Rendering SVG Data"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later & MIT"

PV = "2.56.1"

RPM_NAME = "librsvg-2-2-2.56.1-3.1.aarch64.rpm"
RPM_HASH = "cca0ef640397f6047da18c0a6902707106321cb5c4f9eb3bb5ae82c1abe74b5fd79b3a840abdfd1a86767508ecad2ec913180286d0b78fd98a405f91bbb4dff6"

RPROVIDES:${PN} += "librsvg \
librsvg-2-2 \
librsvg-2.so.2 \
librsvg2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
