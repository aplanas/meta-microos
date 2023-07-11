SUMMARY = "KDE Privacy Utility"
DESCRIPTION = "Helps clean unwanted traces the user leaves on the system."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "sweeper-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "db267da2f135f368e0867fa1cb921e52f42bebec0c768d31cb2db72156c354ace0fd87e044e6a1b460cecf94a9f93a9f54ad0e929abb3ae18451a81451a0fbf9"

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
