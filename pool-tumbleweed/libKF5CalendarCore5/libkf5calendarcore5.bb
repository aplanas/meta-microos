SUMMARY = "Library to access to and handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5CalendarCore5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2ab8f614894f9c69ef59ca35617488f88672aaab644325c6c49b12e4b332be01c954756f1f339bf9f74e173f0acd6a1b5750758b9e5c21e30b838a95e4fb15ca"

RPROVIDES:${PN} += "libKF5CalendarCore.so.5()(64bit) \
libKF5CalendarCore5 \
libKF5CalendarCore5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libical.so.3()(64bit) \
libicalss.so.3()(64bit) \
libicalvcal.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
