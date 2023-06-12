SUMMARY = "Reversi board game"
DESCRIPTION = "KReversi is a board game game where two players have to gain the \
majority of pieces on the board. This is done by tactically placing \
ones pieces to turn over the opponents pieces."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kreversi-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3c1b3f850ad0f1ee721c61f1e5f820cf2c64ab91b442b067f18430e6a0a47f933dcc1a7ed198cd20dbd5db410d212b2c159bb3b64f3a52e96f2f8291039ce7d7"

RPROVIDES:${PN} += "application() \
application(org.kde.kreversi.desktop) \
kreversi \
kreversi(aarch-64) \
kreversi5 \
metainfo() \
metainfo(org.kde.kreversi.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(org.kde.games.core.0)"

inherit rpm
