SUMMARY = "Rice Video Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the Rice Video Plugin for the Mupen64plus Nintendo 64 \
Emulator. It provides a high-level graphics emulation with support for \
high-resolution texture support."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-video-rice-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "4b192333b3bd39124329716c726c8195a02d2a1a2ebf4f05751efeab2f4a6dc9ae479f82f16ab9760b603481af939fa96d3b8fe574179f02989a6a325d27b5a0"

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
