SUMMARY = "A PNG File Compressor"
DESCRIPTION = "OptiPNG is a PNG optimizer that recompresses image files to a smaller \
size, without losing any information. This program also converts \
external formats (BMP, GIF, PNM; TIFF support is coming up) to \
optimized PNG, and performs PNG integrity checks and corrections."
LICENSE = "Zlib"

PV = "0.7.7"

RPM_NAME = "optipng-0.7.7-4.2.aarch64.rpm"
RPM_HASH = "7d4720fc744672e355b0ccd54e9f4ca0684370c7419bea0912db8cdf1a7b7f467993f38c49ef44e10ac28f887ba6d51ca3b2b4426872b54b7039a08f6786169f"

RPROVIDES:${PN} += "optipng \
optipng(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
