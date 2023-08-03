SUMMARY = "A Library for Rendering SVG Data"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later & MIT"

PV = "2.56.3"

RPM_NAME = "librsvg-2-2-2.56.3-1.1.aarch64.rpm"
RPM_HASH = "1c41209243cef12bb9cacd20e38f8b61a989aa43cccc90d580b27a8ee609bb3319710de7cc4eb91b079bbbc15cfded2110ae96b762c7984de57c24efc36d1fed"

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
