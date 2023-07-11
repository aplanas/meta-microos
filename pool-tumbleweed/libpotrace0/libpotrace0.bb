SUMMARY = "Library for Tracing a Bitmap to Scalable Outline Image"
DESCRIPTION = "Potrace is a utility for tracing a bitmap, which means, transforming a \
bitmap into a smooth, scalable image.  The input is a bitmap (PBM, PGM, \
PPM, or BMP), and the default output is one of several vector file \
formats.  A typical use is to create EPS files from scanned data, such \
as company or university logos, handwritten notes, etc. The resulting \
image is not 'jaggy' like a bitmap, but smooth. It can then be rendered \
at any resolution."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "libpotrace0-1.16-1.15.aarch64.rpm"
RPM_HASH = "26e68179596e2e3d367e866cee4561045eb8869bf2e8be171e25f381c941f84b131eea50d34906424fd9b3e096cfff5b7826009322b65f534f6dc66c738530f5"

RPROVIDES:${PN} += "libpotrace.so.0 \
libpotrace0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
