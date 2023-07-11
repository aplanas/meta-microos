SUMMARY = "Glide64mk2 Video Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the Glide64mk2 Video Plugin for the Mupen64plus \
Nintendo 64 Emulator which provides high-level graphics emulation."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-video-glide64mk2-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "7f276abfbaea8559dc6de14bce37597a196e475821fe4a6b3c4bf5a2a48a8728ec8d328e54295ad61a249eba33179fb09bdf61341c0c5017b1e32da76e2d7baf"

RPROVIDES:${PN} += "mupen64plus-plugin-video \
mupen64plus-plugin-video-glide64mk2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
