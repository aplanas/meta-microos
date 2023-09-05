SUMMARY = "Console applications and utilities for managing calendars"
DESCRIPTION = "Console applications and utilities for managing calendars in Akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-calendar-tools-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "019306415e2adfd29a84297918586b8d563f160ad76c5d4488e4a18ed9c8fbc6c462652afb8abc206b19260f152cb9682686055fe78bb035850fc12d28fa0b53"

RPROVIDES:${PN} += "akonadi-calendar-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5CalendarSupport.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
