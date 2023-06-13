SUMMARY = "Development files for lasem, a MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "lasem-devel-0.4.4-2.15.aarch64.rpm"
RPM_HASH = "b9e54bf31cc89556f381dceb5d13b6610974f9fc47259f21676cc9ea9aca1147beb4a3c3e63a8992d35bb8d5afc580436bf5e3fa760e11f4fad3c65a4efc4e6a"

RPROVIDES:${PN} += "lasem-devel \
lasem-devel(aarch-64) \
pkgconfig(lasem-0.4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblasem-0_4-4 \
pkgconfig(cairo) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libxml-2.0) \
pkgconfig(pangocairo)"

inherit rpm
