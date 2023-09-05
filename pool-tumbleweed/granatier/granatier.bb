SUMMARY = "Bomberman-like game"
DESCRIPTION = "In this game, the player walks through an arena, lays bombs and, in \
that way, is to kill enemies. Granatier is a clone of the popular \
Bomberman game."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "granatier-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f03e70a98c88d6d9c41bbdc66dee9abf69bc58b935c4844ac5d9989b83f143c34f2f10e8514e762eddbdbf6f13b57206523111ab4596a6e7d99ef95e1833bfdb"

RPROVIDES:${PN} += "granatier \
granatier5"

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
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
