SUMMARY = "Clone of the Touhou Project series of shoot ’em up games"
DESCRIPTION = "Taisei is an open clone of the Touhou Project series. Touhou is a one-man project \
of shoot ’em up games set in an isolated world full of Japanese folklore."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "taisei-1.3.2-2.13.aarch64.rpm"
RPM_HASH = "1ac50ffc57408452593acbd4b96641838a782de6117d20b76c79fad7629e4cf6ce2b1cb4f6fe1a9a6941b90a31a0895ae3b5ded2caea772f8c3c1d1c37e7e943"

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
