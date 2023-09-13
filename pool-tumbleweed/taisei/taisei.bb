SUMMARY = "Clone of the Touhou Project series of shoot ’em up games"
DESCRIPTION = "Taisei is an open clone of the Touhou Project series. Touhou is a one-man project \
of shoot ’em up games set in an isolated world full of Japanese folklore."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "taisei-1.4-1.1.aarch64.rpm"
RPM_HASH = "749d6d3f11ea3c54fad07fc271148fb0fcb6d508a31210b56eb002543fd9f27d0d4f420d62edbabf1118921f717463bc5efc79f126e2a343847945d98b5d9dec"

RPROVIDES:${PN} += "taisei"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopusfile.so.0 \
libpng16.so.16 \
libshaderc-shared.so.1 \
libspirv-cross-c-shared.so.0 \
libstdc++.so.6 \
libwebpdecoder.so.3 \
libz.so.1 \
libzip.so.5 \
libzstd.so.1 \
taisei-data"

inherit rpm
