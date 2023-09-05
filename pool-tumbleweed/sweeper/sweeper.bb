SUMMARY = "KDE Privacy Utility"
DESCRIPTION = "Helps clean unwanted traces the user leaves on the system."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "sweeper-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6804c789bc93157563910b131b0133e4c7d6ae25bcc6f662d60512f3c6adf820bd3b1b3420a4b06e4b9cba8be9fef2929b76e1cd55981e5cc0603ee902107b2a"

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
