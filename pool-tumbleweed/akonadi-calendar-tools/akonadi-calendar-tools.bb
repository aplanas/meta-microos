SUMMARY = "Console applications and utilities for managing calendars"
DESCRIPTION = "Console applications and utilities for managing calendars in Akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-calendar-tools-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ce17201a2b6838e255f93146f920b6409dcd3da58fe3dc914cd255d7c4cbe87bb12d862cb3102bd437b40dd1d8dd3206666904e261eca627efb807dac8b308cd"

RPROVIDES:${PN} += "akonadi-calendar-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5CalendarSupport.so.5 \
libKPim5CalendarUtils.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
