SUMMARY = "Library for generating PDF files"
DESCRIPTION = "libHaru is a library for generating PDF files. \
It supports the following features: \
- Generating PDF files with lines, text, images. \
- Outline, text annotation, link annotation. \
- Compressing document with deflate-decode. \
- Embedding PNG, JPEG images. \
- Embedding Type1 font and TrueType font. \
- Creating encrypted PDF files. \
- Using various character sets (ISO8859-1~16, MSCP1250~8, KOI8-R). \
- CJK fonts and encodings."
LICENSE = "Zlib"

PV = "2.4.3"

RPM_NAME = "libhpdf2-2.4.3-1.1.aarch64.rpm"
RPM_HASH = "ab98129e2a877f97a8e1dcb6d2234fc31f402c2d1d39454d58c978473e8341d06702e6d100b0b4521f5cb5478946e9c9b30fe9eaee07d2027c8c8e5233906b2a"

RPROVIDES:${PN} += "libhpdf.so.2 \
libhpdf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
