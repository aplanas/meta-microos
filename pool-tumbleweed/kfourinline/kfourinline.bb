SUMMARY = "Four Wins game"
DESCRIPTION = "Four wins is a two-player board game where you have to align four \
(gravity-affected) pieces of the same colour to win."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kfourinline-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0ac0de27029ceca12a79c8b9777dd3f595e5f5d3c10a68d09e4b6a5c893abc33c7e8c7edf1f752d8cbd4dc088bfb6ba63b3421951664ae4a0da74fd95fe60833"

RPROVIDES:${PN} += "application() \
application(org.kde.kfourinline.desktop) \
kfourinline \
kfourinline(aarch-64) \
kfourinline5 \
metainfo() \
metainfo(org.kde.kfourinline.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DNSSD.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KDEGamesPrivate.so.7()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
