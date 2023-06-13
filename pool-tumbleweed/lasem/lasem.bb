SUMMARY = "MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering. Included in the package \
is a simple application, lasemrender, which is able to convert a MathML, a Latex \
math or an SVG file to either PNG, PDF or an SVG image."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "lasem-0.4.4-2.15.aarch64.rpm"
RPM_HASH = "e4d2d4d678894095344901f83c5f0836f643e80c06fe618d42ed9f64a18e498c4a072923d662c3b1eb608f117663050dbc6d3d3b3d8d0b9e2207407f3d039ddd"

RPROVIDES:${PN} += "lasem \
lasem(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblasem-0.4.so.4()(64bit)"

inherit rpm
