SUMMARY = "Graphical program used to map keyboard keys and mouse controls to a game-pad"
DESCRIPTION = "Antimicrox is a graphical program used to map keyboard keys and mouse \
controls to a gamepad. This program is useful for playing PC games using \
a gamepad that do not have any form of built-in gamepad support. \
However, you can use this program to control any desktop application with \
a gamepad; on Linux, this means that your system has to be running an \
X environment in order to run this program. \
 \
This application is continuation of project called AntiMicro, \
which was later abandoned and revived by juliagoda."
LICENSE = "GPL-3.0-or-later & Zlib"

PV = "3.3.3"

RPM_NAME = "antimicrox-3.3.3-1.3.aarch64.rpm"
RPM_HASH = "448cf0ccceb3c602679364031e90f769064b3551153005576bcf6723b7c588224badba4b0b1033078f141c5da414a55db2dc2ff82d9725b94e5a227213382e82"

RPROVIDES:${PN} += "antimicrox \
antimicrox(aarch-64) \
application() \
application(io.github.antimicrox.antimicrox.desktop) \
metainfo() \
metainfo(io.github.antimicrox.antimicrox.appdata.xml) \
mimehandler(application/x-amgp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.12)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.16)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
