SUMMARY = "CVS Frontend"
DESCRIPTION = "Cervisia is a tool to browse and work with CVS repositories."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "cervisia-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3a463f8df13aa97d30d00899e0e7bc0c6f335ebbe12ec0fdb46d142e8189b610bb9a87ee247cfac68edfd99bf324bd45e1dea51c3083b5e5406b620705655408"

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
