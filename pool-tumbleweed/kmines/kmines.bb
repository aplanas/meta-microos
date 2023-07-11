SUMMARY = "Minesweeper-like game"
DESCRIPTION = "KMines is the classical Minesweeper game where you have to find mines \
by logical deduction."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kmines-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "afba66d6feb74f49d4a8c151af9f17af7a25d06432b7ee3f7ac471c01b97c93c39ced966dc0939a09d2fb962e40195137cd9a5650cce98a1bf08e73a408c2dcb"

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
