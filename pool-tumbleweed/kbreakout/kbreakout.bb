SUMMARY = "Breakout-like game by KDE"
DESCRIPTION = "KBreakout is the KDE version of a Breakout-like game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kbreakout-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fb46e7ec20bd8a04c3e8686018ad115d69033d75bdfb7a6a2274e1616fe8f5f8632cf17cf102675706ddfc49bfa0806cafe89fac7daa9785d00912b3d1d56ac5"

RPROVIDES:${PN} += "kbreakout \
kbreakout5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-org.kde.games.core.0"

inherit rpm
