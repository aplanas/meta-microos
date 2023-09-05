SUMMARY = "Galactic strategy game"
DESCRIPTION = "This the KDE version of Gnu-Lactic Konquest, a multi-player strategy \
game. The goal of the game is to expand your interstellar empire across \
the galaxy."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konquest-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0e7a049fbf8b5d3cf2f16553b57574a9e7442c26eb2f7c9d3dd66d07c029f1ad2d82f13add7e681cd4e2f4386ed6b86de311a710adc63ecfe08039ff46787460"

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
