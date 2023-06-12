SUMMARY = "Akonadi calendar integration - serializer plugin"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write calendar data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-plugin-calendar-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5401965798f1a30d980a7f39e0b5b2f3a0e003b875626d97cfae20a42932f3145be075b99164fd642802b7ebbd878a5dfb15f17ef6e02a7fdc0b972625006417"

RPROVIDES:${PN} += "akonadi-plugin-calendar akonadi-plugin-calendar(aarch-64) libakonadicalendarplugin.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiCalendar.so.5()(64bit) libKPim5AkonadiCalendar5 libKPim5AkonadiCore.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
