SUMMARY = "Puzzle game"
DESCRIPTION = "Turn the board pieces to get all computers connected."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "knetwalk-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3d3bc3a96802c5dc265c793ed4c97f6177145b0682210da949482b5b62ce79c33d684e65010a8027ddd5da7d59561b6a82b57e21caf727b86b4c0c910dac553c"

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
