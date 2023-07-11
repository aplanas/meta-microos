SUMMARY = "MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "liblasem-0_4-4-0.4.4-2.16.aarch64.rpm"
RPM_HASH = "4718507e305e9ebc93fb104f562c26ab26efe0f5e2bc5d4106ae619a7fa6f87b76524cdb29f53cd51221cf8b6e3da15cd1a790547324e4a82c9b8983d48b55d4"

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
