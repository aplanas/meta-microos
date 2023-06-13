SUMMARY = "An open source re-implementation of Roller Coaster Tycoon 2"
DESCRIPTION = "An open source clone of RollerCoaster Tycoon 2 \
that depends on the original game assets. On first \
game start it will create a ~/.config/OpenRCT2/config.ini file \
where the game_path = '' setting has to be set to a directory \
into which the original game has been installed to."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "openrct2-0.4.3-2.2.aarch64.rpm"
RPM_HASH = "db607ac9d03bbda6aecdd23ea20ba0ec41dfe00288c98e55e6944e8a673ad86bb5a1fb8c34b7cdb291ac2e4446911efb1211d645aeff25863e8595b5d1965ebd"

RPROVIDES:${PN} += "application() \
application(openrct2-savegame.desktop) \
application(openrct2-scenario.desktop) \
application(openrct2-uri.desktop) \
application(openrct2.desktop) \
libopenrct2.so()(64bit) \
metainfo() \
metainfo(openrct2.appdata.xml) \
mimehandler(application/x-openrct2-savegame) \
mimehandler(application/x-openrct2-scenario) \
mimehandler(x-scheme-handler/openrct2) \
openrct2 \
openrct2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libspeexdsp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit) \
libzip.so.5()(64bit)"

inherit rpm
