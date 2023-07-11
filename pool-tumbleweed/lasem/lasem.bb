SUMMARY = "MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering. Included in the package \
is a simple application, lasemrender, which is able to convert a MathML, a Latex \
math or an SVG file to either PNG, PDF or an SVG image."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "lasem-0.4.4-2.16.aarch64.rpm"
RPM_HASH = "3f953afadf138a7f3394ec91f35ac08aa52c81bee0a494a5fd5b8358066d6dd96f8d6246e2beacbbb52f96853b5d0d9b8f662d42c0562836bb9b2253daa55f4f"

RPROVIDES:${PN} += "lasem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblasem-0.4.so.4"

inherit rpm
