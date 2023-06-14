SUMMARY = "Four Wins game"
DESCRIPTION = "Four wins is a two-player board game where you have to align four \
(gravity-affected) pieces of the same colour to win."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kfourinline-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0ac0de27029ceca12a79c8b9777dd3f595e5f5d3c10a68d09e4b6a5c893abc33c7e8c7edf1f752d8cbd4dc088bfb6ba63b3421951664ae4a0da74fd95fe60833"

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
