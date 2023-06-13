SUMMARY = "Palette quantization library"
DESCRIPTION = "C library for conversion of RGBA images to 8-bit indexed-color \
(palette) images."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.0"

RPM_NAME = "libimagequant0-2.18.0-1.3.aarch64.rpm"
RPM_HASH = "5bad0fdd5a27ea6618408568b80192f532bd1fbb2a57c355969f2e2f52c6dcc455e12a6e65a5f09c748aa5e2068cfdb34489a3ca62021f1d2bd8941672957837"

RPROVIDES:${PN} += "libimagequant.so.0()(64bit) \
libimagequant0 \
libimagequant0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
