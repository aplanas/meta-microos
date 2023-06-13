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

RPM_NAME = "libpotrace0-1.16-1.14.aarch64.rpm"
RPM_HASH = "f08f612eb36e34ecb1793d51af1bfa27ea7ca1df5a97096e7f3c96a7ba555220abfdc90e33ebba03d4a8f3d5d99db70d24b2b31b10a0063d3c547710e0f611f9"

RPROVIDES:${PN} += "libpotrace.so.0()(64bit) \
libpotrace0 \
libpotrace0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
