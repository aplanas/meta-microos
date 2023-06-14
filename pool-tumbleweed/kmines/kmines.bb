SUMMARY = "Minesweeper-like game"
DESCRIPTION = "KMines is the classical Minesweeper game where you have to find mines \
by logical deduction."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmines-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a28613ddf848b842fba007191c1102c72f963daf300ce1b5c0b2993cdf1d01c54a1e74e4f18048d7deac20749f3c3a8cf2ff518db4769a368c9fb8e792d243b6"

RPROVIDES:${PN} += "kmines \
kmines5"

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
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
