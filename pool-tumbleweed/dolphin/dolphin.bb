SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the default file manager of KDE Workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "dolphin-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d3c228ba13969846bf50985f79f6b6e14d26eb241464a8198c2dd440a425f843c359d559f137c7d4b641e4fe4038a8225d1ffc0edf0c8fe7f6beb797ed9f9f0f"

RPROVIDES:${PN} += "dolphin"

RDEPENDS:${PN} += "/sbin/ldconfig \
baloo5-kioslaves \
dolphin-part \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Baloo.so.5 \
libKF5BalooWidgets.so.5 \
libKF5Bookmarks.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libdolphinprivate.so.5 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
