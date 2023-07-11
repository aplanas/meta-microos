SUMMARY = "Reminder daemon client"
DESCRIPTION = "Kalendarac is a reminder daemon client for calendar events."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kalendarac-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f9a63e89b0680879889f25231e1c8fc74c112628a0b163bde50814d0ac7eca8a8e9c431359c59b85aa86a2f2edc4c1aa3470d29e092859952f6fd53c10d37555"

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
