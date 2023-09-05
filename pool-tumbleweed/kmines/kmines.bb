SUMMARY = "Minesweeper-like game"
DESCRIPTION = "KMines is the classical Minesweeper game where you have to find mines \
by logical deduction."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kmines-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "60b80eb0c207617c005283e34da41a5b8cbffa276e667d7c19e36b2cbb7a716f9e607ad16087a72a7fca5c160ab73caca6b2c36c8091318a027f46d9b26bc7dd"

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
