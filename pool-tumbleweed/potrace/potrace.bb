SUMMARY = "Utility for Tracing a Bitmap to Scalable Outline Image"
DESCRIPTION = "Potrace is a utility for tracing a bitmap, which means, transforming a \
bitmap into a smooth, scalable image.  The input is a bitmap (PBM, PGM, \
PPM, or BMP), and the default output is one of several vector file \
formats.  A typical use is to create EPS files from scanned data, such \
as company or university logos, handwritten notes, etc. The resulting \
image is not 'jaggy' like a bitmap, but smooth. It can then be rendered \
at any resolution."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "potrace-1.16-1.14.aarch64.rpm"
RPM_HASH = "65a1274fadcf562c51afc21ae820761b35fb11d20312aa37e49344285fdfd0dc3e53415ecc561611a88b011ecaf907145b1ada46b501f6ca9b925be2fa7f52fb"

RPROVIDES:${PN} += "bitmap-tracing \
potrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpotrace.so.0 \
libz.so.1"

inherit rpm
