SUMMARY = "The Doomsday Engine: DOOM/Hertic/Hexen port with pretty graphics"
DESCRIPTION = "The Doomsday Engine is a source port with support for Doom, Heretic, \
and Hexen. It does not support BOOM extensions."
LICENSE = "GPL-2.0-or-later & GPL-2.0-only & SUSE-GPL-2.0-with-linking-exception & BSD-3-Clause & LGPL-3.0-or-later"

PV = "2.2.2"

RPM_NAME = "doomsday-2.2.2-4.4.aarch64.rpm"
RPM_HASH = "1b9083268a517436514bae795f64954d8d1c7236456188213625e2e74ae70bd36229b881c6bfe7ab36ef488e22c85038e85092f47e97da3e06d1ec112ed8454b"

RPROVIDES:${PN} += "application() \
application(net.dengine.Doomsday.desktop) \
application(net.dengine.Shell.desktop) \
bundled(assimp) \
config(doomsday) \
deng \
doomsday \
doomsday(aarch-64) \
jdoom \
jheretic \
jhexen \
libaudio_fluidsynth.so()(64bit) \
libaudio_openal.so()(64bit) \
libdeng_appfw.so.2.2()(64bit) \
libdeng_core.so.2.2()(64bit) \
libdeng_doomsday.so.2.2()(64bit) \
libdeng_gamefw.so.2.2()(64bit) \
libdeng_gui.so.2.2()(64bit) \
libdeng_legacy.so.2.2()(64bit) \
libdeng_shell.so.2.2()(64bit) \
libdoom.so()(64bit) \
libdoom64.so()(64bit) \
libheretic.so()(64bit) \
libhexen.so()(64bit) \
libimportdeh.so()(64bit) \
libimportidtech1.so()(64bit) \
libimportsave.so()(64bit) \
libimportudmf.so()(64bit) \
metainfo() \
metainfo(net.dengine.Doomsday.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
Mesa-libGL1 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfluidsynth.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libminizip.so.1()(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libopenal.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libz.so.1()(64bit)"

inherit rpm
