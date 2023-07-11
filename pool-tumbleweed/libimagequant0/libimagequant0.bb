SUMMARY = "Palette quantization library"
DESCRIPTION = "C library for conversion of RGBA images to 8-bit indexed-color \
(palette) images."
LICENSE = "GPL-3.0-or-later"

PV = "2.18.0"

RPM_NAME = "libimagequant0-2.18.0-1.4.aarch64.rpm"
RPM_HASH = "787afd27beb4877e4ecf6f01d5f2610af9c7ae1139e2ef10a6cd556a1d5b65576e75599889f4b1102a842b4bea1416ca420a6207f78f7dcfb1a98831ad50aebb"

RPROVIDES:${PN} += "libimagequant.so.0 \
libimagequant0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
