SUMMARY = "An opensource implementation of Wolfenstein3D engine"
DESCRIPTION = "ECWolf is a port of the Wolfenstein 3D engine based of Wolf4SDL."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "ecwolf-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "ac0f1e852815b9d3817e0371410295cf6c0fbf961c96788615fe40c274056879e6a68b3ee248b8fdc050c77d942018fd741019b0844827ba824f69487d3a055e"

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
