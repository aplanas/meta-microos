SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the default file manager of KDE Workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dolphin-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "39a52fb27fd2ae4ae32bccf0f8608d131ee3198dd463518b7e55eebda63cc9c2a44cf2d5cc40dfe1a8636875e70f19839e41b3696373ef1a7ff44726976ddfde"

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
