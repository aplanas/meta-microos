SUMMARY = "Minesweeper-like game"
DESCRIPTION = "KMines is the classical Minesweeper game where you have to find mines \
by logical deduction."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmines-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a28613ddf848b842fba007191c1102c72f963daf300ce1b5c0b2993cdf1d01c54a1e74e4f18048d7deac20749f3c3a8cf2ff518db4769a368c9fb8e792d243b6"

RPROVIDES:${PN} += "application() \
application(org.kde.kmines.desktop) \
kmines \
kmines(aarch-64) \
kmines5 \
metainfo() \
metainfo(org.kde.kmines.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
