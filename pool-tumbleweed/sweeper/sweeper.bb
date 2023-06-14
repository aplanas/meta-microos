SUMMARY = "KDE Privacy Utility"
DESCRIPTION = "Helps clean unwanted traces the user leaves on the system."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "sweeper-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f204daa7783730ebeeeb7c047823a19526ea109560ddf6f0e741bb369dc1ad7d196705ff28c9efd81736f7f0c60b214153c028bade096b82d9494cf76018e23d"

RPROVIDES:${PN} += "sweeper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ActivitiesStats.so.1 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
