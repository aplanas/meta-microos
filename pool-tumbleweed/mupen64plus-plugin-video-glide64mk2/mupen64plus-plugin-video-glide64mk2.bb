SUMMARY = "Glide64mk2 Video Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the Glide64mk2 Video Plugin for the Mupen64plus \
Nintendo 64 Emulator which provides high-level graphics emulation."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-video-glide64mk2-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "6bf57897e3ad5cf3b90b4b48d75516e0266293bf8955a0b4e1c462adffd3cb8572f32d3a1bde6d093dc9f56667b1194ba3f78dbef70ff356de2d9ed1c9eab5e8"

RPROVIDES:${PN} += "mupen64plus-plugin-video \
mupen64plus-plugin-video-glide64mk2 \
mupen64plus-plugin-video-glide64mk2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
