SUMMARY = "Japanese Reference/Study Tool"
DESCRIPTION = "Kiten is a tool to learn Japanese."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "23.04.3"

RPM_NAME = "kiten-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "7faa794b06f1222fb40c653cddb19849dd33da43764616341b5b60b2aef676836b238972e4f17a6dbd8cb783e0d4391c9cd61d556f42627687c5f5b5acf98c90"

RPROVIDES:${PN} += "kiten \
kiten5 \
libkiten.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
edict-eucjp \
fonts-KanjiStrokeOrders \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
