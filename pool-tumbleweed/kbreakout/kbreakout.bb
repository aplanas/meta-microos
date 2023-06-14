SUMMARY = "Breakout-like game by KDE"
DESCRIPTION = "KBreakout is the KDE version of a Breakout-like game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kbreakout-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "dfbc60950742dc2bd346a1a890e366157ecc4e9ad44893009c746f43c96d4062c468502f2f7f7fb387fed8da7e970056477c5a035e9f21444496544fde11ed55"

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
