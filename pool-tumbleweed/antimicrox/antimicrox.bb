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

RPROVIDES:${PN} += "antimicrox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
