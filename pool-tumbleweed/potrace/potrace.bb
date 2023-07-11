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

RPM_NAME = "potrace-1.16-1.15.aarch64.rpm"
RPM_HASH = "a45b9b5dde155b7442db11bb4e162eec2ce039a57bad447ec27220940aedcca31cb542be4a460933735f692581d4b27c57cbf69f559ea1e8a0a6ae4bc3251dca"

RPROVIDES:${PN} += "bitmap-tracing \
potrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpotrace.so.0 \
libz.so.1"

inherit rpm
