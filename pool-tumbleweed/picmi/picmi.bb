SUMMARY = "Nonogram Logic game"
DESCRIPTION = "A nonogram logic game by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "picmi-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5cf2c74087cbdf67c1fd972c51827ec453ddda378f1227d4d9bffe69ccd206cea0ea97c215d0243ed398a61763d2434479d9dbb2499fc490625ea4f628db971d"

RPROVIDES:${PN} += "picmi \
picmi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
