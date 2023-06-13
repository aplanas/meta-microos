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

RPROVIDES:${PN} += "application() \
application(chocolate-doom-screensaver.desktop) \
application(chocolate-doom.desktop) \
application(chocolate-heretic.desktop) \
application(chocolate-hexen.desktop) \
application(chocolate-strife.desktop) \
chocolate-doom \
chocolate-doom(aarch-64) \
chocolate-heretic \
chocolate-hexen \
chocolate-strife \
metainfo() \
metainfo(chocolate-doom.appdata.xml) \
metainfo(chocolate-heretic.appdata.xml) \
metainfo(chocolate-hexen.appdata.xml) \
metainfo(chocolate-strife.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_net-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit)"

inherit rpm
