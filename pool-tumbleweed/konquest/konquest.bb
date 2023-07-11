SUMMARY = "Galactic strategy game"
DESCRIPTION = "This the KDE version of Gnu-Lactic Konquest, a multi-player strategy \
game. The goal of the game is to expand your interstellar empire across \
the galaxy."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "konquest-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "31cd9033e16ef397021a36b63f26a2f35182d26512c4dc191ebea89f5875a4ed7daaeafd477d14466e66f8c595acd854cb78d807a8f487cee4e35517e5137282"

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
