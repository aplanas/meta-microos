SUMMARY = "Development files for lasem, a MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "lasem-devel-0.4.4-2.16.aarch64.rpm"
RPM_HASH = "a84d99a3d3755a0a88246f57f550e07c11cd6c8bd0917cc635b9f0a9b6c5cac79591860742a96769e891cdff5206af56fa2bfb11381f9acd8b24eb6bd90c2727"

RPROVIDES:${PN} += "lasem-devel \
pkgconfig-lasem-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblasem-0-4-4 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-pangocairo"

inherit rpm
