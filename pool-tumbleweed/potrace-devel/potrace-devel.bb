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

RPM_NAME = "potrace-devel-1.16-1.15.aarch64.rpm"
RPM_HASH = "c0fe97ea77d083208959706c6a456125b3a387ab18d9f5d88608e017894c40496db57644c38e2d8ef46e916760f36f01b0dda978e15c19ea92aa9dc47798001c"

RPROVIDES:${PN} += "potrace-devel"

RDEPENDS:${PN} += "potrace"

inherit rpm
