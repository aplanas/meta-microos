SUMMARY = "Fantasy Turn-Based Strategy Game"
DESCRIPTION = "Battle for Wesnoth is a fantasy turn-based strategy game. Battle for \
control of villages, using variety of units which have advantages and \
disadvantages in different types of terrains and against different \
types of attacks. Units gain experience and advance levels, and are \
carried over from one scenario to the next campaign."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.17.16"

RPM_NAME = "wesnoth-1.17.16-1.1.aarch64.rpm"
RPM_HASH = "5683d51190c0ee6bb06728f0359472fd6a68b7d71d61bb3a1c7a542307837afd66ea9412e5cee19a61fc74a506d8c689a93fc775b35664a51738ad3bc63dbdbb"

RPROVIDES:${PN} += "application() \
application(org.wesnoth.Wesnoth.desktop) \
metainfo() \
metainfo(org.wesnoth.Wesnoth.appdata.xml) \
wesnoth \
wesnoth(aarch-64)"

RDEPENDS:${PN} += "dejavu \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_random.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libhistory.so.8()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit) \
sazanami-fonts \
wesnoth-data \
wesnoth-fslayout"

inherit rpm
