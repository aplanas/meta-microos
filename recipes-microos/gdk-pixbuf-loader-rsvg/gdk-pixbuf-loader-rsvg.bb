SUMMARY = "A gdk-pixbuf loader for SVG using librsvg"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org). \
 \
This package provides a librsvg-based gdk-pixbuf loader."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.0"

RPM_NAME = "gdk-pixbuf-loader-rsvg-2.56.0-3.1.aarch64.rpm"
RPM_HASH = "4da5f4c94fe8817032f5f42fd32a4ba8017815fe7e3fbd6c5f735dc5d16c55351912630b1957fbb69caec47e9b00124b9f27f177b253be9e6409939277cf36dc"

RPROVIDES:${PN} += "gdk-pixbuf-loader-rsvg gdk-pixbuf-loader-rsvg(aarch-64) libpixbufloader-svg.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh gdk-pixbuf-query-loaders libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
