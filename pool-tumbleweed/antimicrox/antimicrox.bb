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

RPM_NAME = "antimicrox-3.3.3-1.4.aarch64.rpm"
RPM_HASH = "2694ca09cbb262c717443ee0bda1cc6f4168c756efd1df61b0f68fbb70f9b930ea718ead3f5b78e65a7a71e3015f6ed419f61e72c86cd0f81cff52754b8c0c5e"

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
