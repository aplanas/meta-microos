SUMMARY = "Higher resolution DOOM/Heretic/Hexen/Strife source port"
DESCRIPTION = "Crispy Doom is a limit-removing enhanced-resolution Doom source port \
based on Chocolate Doom."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "crispy-doom-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "6a5584f15843dfd2d70ab174b05c7afe11aa7c81094f8654122d74bd313c4ce5460ae4528eda07042fe998ba468d2e61fd07ca6fd2b4a14077957a4e4758ebec"

RPROVIDES:${PN} += "application() \
application(io.github.fabiangreffrath.Doom.desktop) \
application(io.github.fabiangreffrath.Doom_Screensaver.desktop) \
application(io.github.fabiangreffrath.Heretic.desktop) \
application(io.github.fabiangreffrath.Hexen.desktop) \
application(io.github.fabiangreffrath.Setup.desktop) \
crispy-doom \
crispy-doom(aarch-64) \
crispy-heretic \
crispy-hexen \
crispy-strife \
metainfo() \
metainfo(io.github.fabiangreffrath.Doom.metainfo.xml) \
metainfo(io.github.fabiangreffrath.Heretic.metainfo.xml) \
metainfo(io.github.fabiangreffrath.Hexen.metainfo.xml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_net-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
