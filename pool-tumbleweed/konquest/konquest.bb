SUMMARY = "Galactic strategy game"
DESCRIPTION = "This the KDE version of Gnu-Lactic Konquest, a multi-player strategy \
game. The goal of the game is to expand your interstellar empire across \
the galaxy."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konquest-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0c874325266de4b2ba70a3b9ea439b1adc503cc9265121ed191ae8dc8ab8e8c81fc3fbad84c20db5ab0f2af54e15c94ee80f637c7b885491aeeb065afa548f9e"

RPROVIDES:${PN} += "konquest \
konquest5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
