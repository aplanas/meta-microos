SUMMARY = "MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "liblasem-0_4-4-0.4.4-2.15.aarch64.rpm"
RPM_HASH = "5cd38b52763500d84697e7d416c8d7a519f6af36c9fd7ed8286d2e760b839a0b007fe0b319611f14aa85b336b3756c51c83c5889095ec53471cb86cd74597d22"

RPROVIDES:${PN} += "liblasem-0-4-4 \
liblasem-0.4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
