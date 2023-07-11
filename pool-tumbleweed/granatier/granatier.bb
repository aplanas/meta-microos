SUMMARY = "Bomberman-like game"
DESCRIPTION = "In this game, the player walks through an arena, lays bombs and, in \
that way, is to kill enemies. Granatier is a clone of the popular \
Bomberman game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "granatier-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3adee006d745e3bc63601d7fc5177efb87861b2d4fa80decb71adabf4b5e1537b1178f744e362c097cb5595f0706043e8e48700a65b6f877ccb77260d11d8ae3"

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
