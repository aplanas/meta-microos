SUMMARY = "Game based on Rubik's Cube"
DESCRIPTION = "This package contains the KDE game Kubrick which is based on Rubik's \
Cube."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kubrick-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2dacbe1b1e428d49587bd9b0432e30df4a102a94d66a449a8d7c6c296d453d0c66fc344c9c97bb3e024f0dd574deea78b0eab547c483bbeacb0bc95869341800"

RPROVIDES:${PN} += "kubrick \
kubrick5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
