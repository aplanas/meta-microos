SUMMARY = "Enhanced Quake 2 Source Port"
DESCRIPTION = "Yamagi Quake II is an enhanced client for id Software's Quake II. The \
main focus is an unchanged single player experience; the gameplay and \
graphics are unaltered. It also features: anisotropic filtering and \
multi-sample anti-aliasing, widescreen aspect ratio and unlimited \
screen size, compatibility with most mods, optional support for \
retexturing packs and HUD scaling."
LICENSE = "GPL-2.0-only"

PV = "8.20"

RPM_NAME = "yamagi-quake2-8.20-1.4.aarch64.rpm"
RPM_HASH = "8a183a68185b20d1f1a393df057be7463ded87357fecc5850550009ea8d4753dd579ef3a6256fa2f49cfe3276d3c9dce8fc7a195671f23fecc98eeae0b9d9a7e"

RPROVIDES:${PN} += "yamagi-quake2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
