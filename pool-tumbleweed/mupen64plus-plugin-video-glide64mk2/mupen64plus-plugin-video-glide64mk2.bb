SUMMARY = "Glide64mk2 Video Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the Glide64mk2 Video Plugin for the Mupen64plus \
Nintendo 64 Emulator which provides high-level graphics emulation."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-video-glide64mk2-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "6bf57897e3ad5cf3b90b4b48d75516e0266293bf8955a0b4e1c462adffd3cb8572f32d3a1bde6d093dc9f56667b1194ba3f78dbef70ff356de2d9ed1c9eab5e8"

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
