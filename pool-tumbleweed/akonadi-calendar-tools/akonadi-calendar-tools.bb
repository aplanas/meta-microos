SUMMARY = "Console applications and utilities for managing calendars"
DESCRIPTION = "Console applications and utilities for managing calendars in Akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-calendar-tools-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6abb03761321cec4639bcb158f22933c49a95aeed0f3b92bd0f8a73b0caf34d6b87f3749b159c6f4b60920a1a0d509449a858b59d63de4b69382bb6ddf473b64"

RPROVIDES:${PN} += "akonadi-calendar-tools \
akonadi-calendar-tools(aarch-64) \
application() \
application(konsolekalendar.desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5CalendarSupport.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
