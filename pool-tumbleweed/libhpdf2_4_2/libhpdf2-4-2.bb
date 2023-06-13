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

PV = "2.4.2"

RPM_NAME = "libhpdf2_4_2-2.4.2-1.3.aarch64.rpm"
RPM_HASH = "62e7bb1513871d4aa22c36a8089c3ee820173c1cbcc03b0c0135070fe5ec40788484799b0691c762a92877ba87c3da613015e31024fcff9046d9c14ef386e4f8"

RPROVIDES:${PN} += "libhpdf.so()(64bit) \
libhpdf2_4_2 \
libhpdf2_4_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
