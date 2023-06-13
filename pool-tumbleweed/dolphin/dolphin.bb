SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the default file manager of KDE Workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dolphin-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "39a52fb27fd2ae4ae32bccf0f8608d131ee3198dd463518b7e55eebda63cc9c2a44cf2d5cc40dfe1a8636875e70f19839e41b3696373ef1a7ff44726976ddfde"

RPROVIDES:${PN} += "application() \
application(org.kde.dolphin.desktop) \
application(org.kde.dolphinsu.desktop) \
dolphin \
dolphin(aarch-64) \
metainfo() \
metainfo(org.kde.dolphin.appdata.xml) \
mimehandler(inode/directory)"

RDEPENDS:${PN} += "/sbin/ldconfig \
baloo5-kioslaves \
dolphin-part \
ld-linux-aarch64.so.1()(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5Baloo.so.5()(64bit) \
libKF5BalooWidgets.so.5()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdolphinprivate.so.5()(64bit) \
libphonon4qt5.so.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
