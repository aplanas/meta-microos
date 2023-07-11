SUMMARY = "Reversi board game"
DESCRIPTION = "KReversi is a board game game where two players have to gain the \
majority of pieces on the board. This is done by tactically placing \
ones pieces to turn over the opponents pieces."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kreversi-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9e8d7049827518fb1f7ee9042665b19156a6661480c28f571099795a6641b6efac90648300e75b6354a997f591a53fb4422bde85048e8e8d3f3e2c407ffb3980"

RPROVIDES:${PN} += "kreversi \
kreversi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-org.kde.games.core.0"

inherit rpm
