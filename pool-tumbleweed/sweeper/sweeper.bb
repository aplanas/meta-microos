SUMMARY = "KDE Privacy Utility"
DESCRIPTION = "Helps clean unwanted traces the user leaves on the system."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "sweeper-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f204daa7783730ebeeeb7c047823a19526ea109560ddf6f0e741bb369dc1ad7d196705ff28c9efd81736f7f0c60b214153c028bade096b82d9494cf76018e23d"

RPROVIDES:${PN} += "application() \
application(org.kde.sweeper.desktop) \
metainfo() \
metainfo(org.kde.sweeper.appdata.xml) \
sweeper \
sweeper(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ActivitiesStats.so.1()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
