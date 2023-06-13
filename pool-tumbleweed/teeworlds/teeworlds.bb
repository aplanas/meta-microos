SUMMARY = "A retro multiplayer jump-and-swing shooter"
DESCRIPTION = "Teeworlds is an online multiplayer game. Battles can be played with \
up to 16 players in a variety of game modes, including Team \
Deathmatch and Capture The Flag. Own maps can be designed."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "0.7.5"

RPM_NAME = "teeworlds-0.7.5-3.4.aarch64.rpm"
RPM_HASH = "3b40afa5b44ce93ea403def8660e9f7b85a4d7751cac0a477ce3e085a4afe0216a8164a2e889e76125014b524ecad1111aa94d56465987caaf16ffe96a8b2b3b"

RPROVIDES:${PN} += "application() \
application(teeworlds.desktop) \
metainfo() \
metainfo(teeworlds.appdata.xml) \
teewars \
teeworlds \
teeworlds(aarch-64)"

RDEPENDS:${PN} += "dejavu-fonts \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpnglite.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libwavpack.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
