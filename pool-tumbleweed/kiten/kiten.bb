SUMMARY = "Japanese Reference/Study Tool"
DESCRIPTION = "Kiten is a tool to learn Japanese."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "23.08.0"

RPM_NAME = "kiten-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "29269b8e21a568c0f85eefa52b2dc83135b744a3c333128e3c81744f8c0fc527e89bfe3af9b992d8b1c95bf2e36f73badd948a1e256e9c886819cb702f5b9edb"

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
