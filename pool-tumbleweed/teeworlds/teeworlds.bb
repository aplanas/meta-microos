SUMMARY = "A retro multiplayer jump-and-swing shooter"
DESCRIPTION = "Teeworlds is an online multiplayer game. Battles can be played with \
up to 16 players in a variety of game modes, including Team \
Deathmatch and Capture The Flag. Own maps can be designed."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "0.7.5"

RPM_NAME = "teeworlds-0.7.5-3.4.aarch64.rpm"
RPM_HASH = "3b40afa5b44ce93ea403def8660e9f7b85a4d7751cac0a477ce3e085a4afe0216a8164a2e889e76125014b524ecad1111aa94d56465987caaf16ffe96a8b2b3b"

RPROVIDES:${PN} += "teewars \
teeworlds"

RDEPENDS:${PN} += "dejavu-fonts \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpnglite.so.0 \
libstdc++.so.6 \
libwavpack.so.1 \
libz.so.1"

inherit rpm
