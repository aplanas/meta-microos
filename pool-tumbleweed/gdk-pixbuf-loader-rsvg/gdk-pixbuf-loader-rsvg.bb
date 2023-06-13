SUMMARY = "A gdk-pixbuf loader for SVG using librsvg"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides a librsvg-based gdk-pixbuf loader."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "gdk-pixbuf-loader-rsvg-2.56.1-1.1.aarch64.rpm"
RPM_HASH = "3b8bafd5b84d8b42753885be5a084b03673518b3c8be86dc9ea1f48a657da92eceaf9248fe9ee2e82b891ffabad32607109d9af418990b36c931efa82638546a"

RPROVIDES:${PN} += "gdk-pixbuf-loader-rsvg \
gdk-pixbuf-loader-rsvg(aarch-64) \
libpixbufloader-svg.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
gdk-pixbuf-query-loaders \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
