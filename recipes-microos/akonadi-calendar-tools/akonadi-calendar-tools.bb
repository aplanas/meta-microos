SUMMARY = "Console applications and utilities for managing calendars"
DESCRIPTION = "Console applications and utilities for managing calendars in Akonadi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-calendar-tools-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5fb4e3d86e1e5bbe51c9cb768a257f75d5fcc5e6d97f16d4cab5c6372064a3f31930d46762b39daec434583e8e4ebd8430a07983ab5ec1c66ee66f53fee7d685"

RPROVIDES:${PN} += "akonadi-calendar-tools akonadi-calendar-tools(aarch-64) application() application(konsolekalendar.desktop)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiCalendar.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5CalendarSupport.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
