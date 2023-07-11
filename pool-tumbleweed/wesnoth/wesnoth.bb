SUMMARY = "Fantasy Turn-Based Strategy Game"
DESCRIPTION = "Battle for Wesnoth is a fantasy turn-based strategy game. Battle for \
control of villages, using variety of units which have advantages and \
disadvantages in different types of terrains and against different \
types of attacks. Units gain experience and advance levels, and are \
carried over from one scenario to the next campaign."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-1.17.16-1.2.aarch64.rpm"
RPM_HASH = "9ec7c74bf9350504b44d6d5bc2652ced299b896d15903aa0faaeb2a1fe43d787b8f4bca2a266210066d79a34e88c4139b8a8ca931201925c650e889b519375a0"

RPROVIDES:${PN} += "wesnoth"

RDEPENDS:${PN} += "dejavu \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-random.so.1.82.0 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libhistory.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libvorbisfile.so.3 \
sazanami-fonts \
wesnoth-data \
wesnoth-fslayout"

inherit rpm
