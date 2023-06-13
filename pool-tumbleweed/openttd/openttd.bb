SUMMARY = "A clone of Chris Sawyer's Transport Tycoon Deluxe"
DESCRIPTION = "OpenTTD is a reimplementation of the Microprose game 'Transport Tycoon Deluxe' with lots of new features and enhancements. To play the game, you need either the original proprietary data set from the game, or install the recommend subpackages OpenGFX, OpenSFX and OpenMSX for an alternate, free set of graphics, sounds and music, respectively. \
 \
Use package openttd-dedicated for systems without SDL."
LICENSE = "GPL-2.0-only"

PV = "13.1"

RPM_NAME = "openttd-13.1-1.2.aarch64.rpm"
RPM_HASH = "d1553e4ee88198c427c093d20b3bb5c92e578d151279b933114a344a87c6b2419f4d041923d8ff976ef191083927159ee362c71ff2f2acaa81a384c4adb6bdf6"

RPROVIDES:${PN} += "application() \
application(openttd.desktop) \
metainfo() \
metainfo(openttd.appdata.xml) \
openttd \
openttd(aarch-64) \
openttd-gui"

RDEPENDS:${PN} += "libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libfluidsynth.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
liblzma.so.5()(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
openttd-data"

inherit rpm
