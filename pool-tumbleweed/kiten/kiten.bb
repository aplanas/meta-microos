SUMMARY = "Japanese Reference/Study Tool"
DESCRIPTION = "Kiten is a tool to learn Japanese."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "23.04.1"

RPM_NAME = "kiten-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "7e66fa73dc9bc26e0feed90e8ba2b6ab00ca2416760709795d40b91ebdb31542ccb444afa3da6d69565e2cef3d66bcba1b4e1d8272378a1d5f523039a1cc3dc7"

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
