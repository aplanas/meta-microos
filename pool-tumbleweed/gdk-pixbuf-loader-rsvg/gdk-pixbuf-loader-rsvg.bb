SUMMARY = "A gdk-pixbuf loader for SVG using librsvg"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides a librsvg-based gdk-pixbuf loader."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "gdk-pixbuf-loader-rsvg-2.56.1-3.1.aarch64.rpm"
RPM_HASH = "38461fc0c4eafea18c92fb6cab4626cd3835089c33b18f1e2879340e655dd2c100eb43ccbaada97057f793ec5cb80eb44b530823d4569c2e78230299811adf4f"

RPROVIDES:${PN} += "gdk-pixbuf-loader-rsvg \
libpixbufloader-svg.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gdk-pixbuf-query-loaders \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librsvg-2.so.2"

inherit rpm
