SUMMARY = "Reminder daemon client"
DESCRIPTION = "Kalendarac is a reminder daemon client for calendar events."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kalendarac-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "737b478f153c7cdc0c41eb8b07e16d29e5196fafa442295714e3853865784d5c12c38a2fdadd2b576a104c607646ca3764ed5a7aea966a0a1ad3f1913f69114a"

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
