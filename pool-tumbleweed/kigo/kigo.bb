SUMMARY = "Traditional Chinese Boardgame by KDE"
DESCRIPTION = "Traditional Chinese Boardgame."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kigo-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "317e36f7fffe9a54ab72fd9ffd45569453166fb8a52fa94aa426efd52d684648c05ea8072d90474755610a3b5aaefdf0b1278395af387095a5dcc1d5fd5fcdbd"

RPROVIDES:${PN} += "kigo \
kigo5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
