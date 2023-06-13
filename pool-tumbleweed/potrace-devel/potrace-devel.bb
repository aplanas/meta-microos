SUMMARY = "Library Development Files for Tracing a Bitmap to Scalable Outline Image"
DESCRIPTION = "Potrace is a utility for tracing a bitmap, which means, transforming a \
bitmap into a smooth, scalable image.  The input is a bitmap (PBM, PGM, \
PPM, or BMP), and the default output is one of several vector file \
formats.  A typical use is to create EPS files from scanned data, such \
as company or university logos, handwritten notes, etc. The resulting \
image is not 'jaggy' like a bitmap, but smooth. It can then be rendered \
at any resolution."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "potrace-devel-1.16-1.14.aarch64.rpm"
RPM_HASH = "d199be6e2cbe23fbf9a6b6bb4629c5e77f550c4483ae05ec6b335dd442a44f1b3ae3e35c8c58545f2b7c07d2b08268bf36076208c59a73edc06c8ed1f45a51a1"

RPROVIDES:${PN} += "potrace-devel \
potrace-devel(aarch-64)"

RDEPENDS:${PN} += "potrace"

inherit rpm
