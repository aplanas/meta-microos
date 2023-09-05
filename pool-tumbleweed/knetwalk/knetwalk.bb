SUMMARY = "Puzzle game"
DESCRIPTION = "Turn the board pieces to get all computers connected."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "knetwalk-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "39126cadd352ca6f5e3aa63056a5bac39e94b6a5643ee9dd1a2463b2a908b0969cffda55bbf5d7162a15720c3cfd8b25d499ababfbee703576abd32964510585"

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
