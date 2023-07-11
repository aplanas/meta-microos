SUMMARY = "Puzzle game"
DESCRIPTION = "Turn the board pieces to get all computers connected."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "knetwalk-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fde1a43b161ba4297a0d92ae272dbb2b8d3fb19558c4201c6e1f62e70f2cb12242d23846c602e841160a5b1bbe8a3a68b016a1c2eb88e4aca0efc21923eea27d"

RPROVIDES:${PN} += "knetwalk \
knetwalk5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-org.kde.games.core.0"

inherit rpm
