SUMMARY = "Conservative DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Chocolate Doom is a Doom source port with focus on accurate \
reproduction of the original DOS version of Doom and other games \
based on the Doom engine. There are no new features, a lack of high \
resolution rendering, and goes as far as to duplicate or recreate \
bugs and crashes found in the DOS executable that were fixed before \
the initial open-sourcing of the Doom engine."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "chocolate-doom-3.0.1-3.1.aarch64.rpm"
RPM_HASH = "6b049e406024c5d57d433b0d0ce20a37330f2d2068d534937d8b934a711abecd0561b4d7d98f3246998fec75715fbf4c81fa448e52732e13d1ecaff07f1192b8"

RPROVIDES:${PN} += "chocolate-doom \
chocolate-heretic \
chocolate-hexen \
chocolate-strife"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libsamplerate.so.0"

inherit rpm
