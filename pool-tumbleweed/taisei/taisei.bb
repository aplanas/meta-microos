SUMMARY = "Clone of the Touhou Project series of shoot ’em up games"
DESCRIPTION = "Taisei is an open clone of the Touhou Project series. Touhou is a one-man project \
of shoot ’em up games set in an isolated world full of Japanese folklore."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "taisei-1.3.2-2.12.aarch64.rpm"
RPM_HASH = "393fca590210a2f95762e478e43674190f1be4b745381867a98076077fbd960c5813deb83b22baf38e1977e2a95bd33142d574d2b62cc636f3457c66980aee3d"

RPROVIDES:${PN} += "taisei"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libfreetype.so.6 \
libm.so.6 \
libopusfile.so.0 \
libpng16.so.16 \
libshaderc-shared.so.1 \
libspirv-cross-c-shared.so.0 \
libwebpdecoder.so.3 \
libz.so.1 \
libzip.so.5 \
taisei-data"

inherit rpm
