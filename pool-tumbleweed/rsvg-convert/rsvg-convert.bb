SUMMARY = "SVG Convert using the GNOME Render SVG library"
DESCRIPTION = "This package contains a tool to convert SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.3"

RPM_NAME = "rsvg-convert-2.56.3-1.1.aarch64.rpm"
RPM_HASH = "6a471b0c9feb480f9b256e87d9626d8b1b7803b9e1a6d56ee7aea059089e94e35db122acac517d0ebfd7ccf184478b25286aa6b7db247d4e803ad48c0c38dff4"

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
