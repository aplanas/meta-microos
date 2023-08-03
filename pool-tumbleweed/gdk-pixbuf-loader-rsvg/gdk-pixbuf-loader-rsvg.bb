SUMMARY = "A gdk-pixbuf loader for SVG using librsvg"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides a librsvg-based gdk-pixbuf loader."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.3"

RPM_NAME = "gdk-pixbuf-loader-rsvg-2.56.3-1.1.aarch64.rpm"
RPM_HASH = "433ffeeeb9d7e1ab9a88f6c106db1b5aa09076b19e16ba3de969dbe0aa693b9679a514a20ef4e4af79f3201521718959e4eae92f361cd586a71b23849838dc65"

RPROVIDES:${PN} += "gdk-pixbuf-loader-rsvg \
libpixbufloader-svg.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gdk-pixbuf-query-loaders \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librsvg-2.so.2"

inherit rpm
