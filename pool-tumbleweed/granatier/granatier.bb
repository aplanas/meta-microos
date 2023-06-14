SUMMARY = "Bomberman-like game"
DESCRIPTION = "In this game, the player walks through an arena, lays bombs and, in \
that way, is to kill enemies. Granatier is a clone of the popular \
Bomberman game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "granatier-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "499bc638986ca8024bf7c52c28264fa762337ac29e6c40600b2a906e28530dfa2d3d4771e3e0ed07b7cd3da589e2e227107a103d579b65e43db81ee606ba24c6"

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
