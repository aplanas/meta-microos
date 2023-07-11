SUMMARY = "Four Wins game"
DESCRIPTION = "Four wins is a two-player board game where you have to align four \
(gravity-affected) pieces of the same colour to win."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kfourinline-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cd7272d4381defd20ea6b3587f951d4f5a860f1b8bd657d56aa62dbe4ee6de09fe03389a1db97a0f141341d43660ca3cf5014d1d0bf26b3c60ff619f37306a53"

RPROVIDES:${PN} += "kfourinline \
kfourinline5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DNSSD.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KDEGamesPrivate.so.7 \
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
