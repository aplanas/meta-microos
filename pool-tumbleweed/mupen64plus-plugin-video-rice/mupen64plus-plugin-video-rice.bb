SUMMARY = "Rice Video Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the Rice Video Plugin for the Mupen64plus Nintendo 64 \
Emulator. It provides a high-level graphics emulation with support for \
high-resolution texture support."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-video-rice-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "07ca00b58346492f3a88bde2fc0655235908bfe58756dd57c2ed82e2fd8458508a48adbfe1f706aa9485379868cc770adc473b622f4be41f572d1d0d59fd6114"

RPROVIDES:${PN} += "mupen64plus-plugin-video \
mupen64plus-plugin-video-rice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
