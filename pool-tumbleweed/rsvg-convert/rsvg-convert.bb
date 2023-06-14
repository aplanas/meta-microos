SUMMARY = "SVG Convert using the GNOME Render SVG library"
DESCRIPTION = "This package contains a tool to convert SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "rsvg-convert-2.56.1-1.1.aarch64.rpm"
RPM_HASH = "27bbecd629e0d9d67458867b0ad08b7b29704c6dc9098797d022079c8c3f82fc28b04514cbc5870d831d5f1aed28c2a0501b4542c2f8e1aed92f80e7069c4c88"

RPROVIDES:${PN} += "rsvg-convert"

RDEPENDS:${PN} += "libc.so.6 \
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
