SUMMARY = "Enhanced Quake 2 Source Port"
DESCRIPTION = "Yamagi Quake II is an enhanced client for id Software's Quake II. The \
main focus is an unchanged single player experience; the gameplay and \
graphics are unaltered. It also features: anisotropic filtering and \
multi-sample anti-aliasing, widescreen aspect ratio and unlimited \
screen size, compatibility with most mods, optional support for \
retexturing packs and HUD scaling."
LICENSE = "GPL-2.0-only"

PV = "8.20"

RPM_NAME = "yamagi-quake2-8.20-1.3.aarch64.rpm"
RPM_HASH = "2e0fdaa302335d217a9e0f7e00ec948c64a3339bb27840b806d238ce2b9fdd3ab3178dcc6b26ad5468dc83c2ff4fdd4eaa9fb27ad2f7352ac20e29e9fc9d199d"

RPROVIDES:${PN} += "yamagi-quake2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
