SUMMARY = "Reminder daemon client"
DESCRIPTION = "Kalendarac is a reminder daemon client for calendar events."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kalendarac-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4accc95fd61e7be1daeaca5993d9c73c466afdce33906d8b7676d51b0bade2f4f8124983bf03bae3a8f29abcdd1d9d6338b9d61f9d01666e7e644f5991fe5837"

RPROVIDES:${PN} += "kalendarac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
