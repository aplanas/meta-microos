SUMMARY = "A PNG File Compressor"
DESCRIPTION = "OptiPNG is a PNG optimizer that recompresses image files to a smaller \
size, without losing any information. This program also converts \
external formats (BMP, GIF, PNM; TIFF support is coming up) to \
optimized PNG, and performs PNG integrity checks and corrections."
LICENSE = "Zlib"

PV = "0.7.7"

RPM_NAME = "optipng-0.7.7-4.3.aarch64.rpm"
RPM_HASH = "bb92d6476c53ec0b934da4b6ac0976f4a27900b2e3a6b71292c158af33cac2ce5de17349301e3997f4ffd5286fbba978c792268c8d7a4df8bcceed49c811315f"

RPROVIDES:${PN} += "optipng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
