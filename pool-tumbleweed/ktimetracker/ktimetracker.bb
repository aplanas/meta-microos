SUMMARY = "Personal Time Tracker"
DESCRIPTION = "KTimeTracker tracks time spent on various tasks."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "ktimetracker-5.0.1-1.18.aarch64.rpm"
RPM_HASH = "19456eba335f30ae1244a52de74c3288866ec066816c550b34f2e5e264fc381588d27e99c8b7b414750cf4e6b931b1438d56114bffdda88a8e0c25a29eef3555"

RPROVIDES:${PN} += "ktimetracker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5Notifications.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
