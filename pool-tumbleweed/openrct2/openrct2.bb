SUMMARY = "An open source re-implementation of Roller Coaster Tycoon 2"
DESCRIPTION = "An open source clone of RollerCoaster Tycoon 2 \
that depends on the original game assets. On first \
game start it will create a ~/.config/OpenRCT2/config.ini file \
where the game_path = '' setting has to be set to a directory \
into which the original game has been installed to."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "openrct2-0.4.3-3.1.aarch64.rpm"
RPM_HASH = "3c85a795c05899f3028094b1841e0f06544c87834e81e4fd6777b980e4fc8f77969a3f2719bff0677c6f2a548d29a5c5f16f4960f7af59b85ea7699ea8c51998"

RPROVIDES:${PN} += "libopenrct2.so \
openrct2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libpng16.so.16 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libz.so.1 \
libzip.so.5"

inherit rpm
