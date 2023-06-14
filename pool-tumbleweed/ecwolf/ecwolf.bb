SUMMARY = "An opensource implementation of Wolfenstein3D engine"
DESCRIPTION = "ECWolf is a port of the Wolfenstein 3D engine based of Wolf4SDL."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "ecwolf-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "919128d4cdc61744bd3b5a0a4f5436f7a998eabba049e69d762e95e5968108132dcace727fa7a423a0e5b68c1487876b9113ef5b69c98445abacd62ca247686d"

RPROVIDES:${PN} += "bundled-gdtoa \
bundled-lzma \
ecwolf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
