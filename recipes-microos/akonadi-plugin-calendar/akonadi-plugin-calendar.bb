SUMMARY = "Akonadi calendar integration - serializer plugin"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write calendar data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-plugin-calendar-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "14a40c04c004c865fae2f25338d773846be375e6dca6bca7fb4f0bba2ea99daf163579bf307ac60e35bcf170f4e5d98c2eeadf1906bbefa688937b9f4ff07995"

RPROVIDES:${PN} += "akonadi-plugin-calendar akonadi-plugin-calendar(aarch-64) libakonadicalendarplugin.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiCalendar.so.5()(64bit) libKPim5AkonadiCalendar5 libKPim5AkonadiCore.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
