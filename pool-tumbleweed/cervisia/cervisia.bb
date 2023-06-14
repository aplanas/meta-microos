SUMMARY = "CVS Frontend"
DESCRIPTION = "Cervisia is a tool to browse and work with CVS repositories."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "cervisia-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c8f0777d1e5e9e86b59dd11ad7b1258604849f269e407a3fa8feddda19b4bcbd5ad52e2a9b3ddb0561b070b240effcaca2dd5f3f523a2ff70fdc4fe3f1c67077"

RPROVIDES:${PN} += "cervisia \
libkdeinit5-cervisia.so \
libkdeinit5-cvsaskpass.so \
libkdeinit5-cvsservice.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Su.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
