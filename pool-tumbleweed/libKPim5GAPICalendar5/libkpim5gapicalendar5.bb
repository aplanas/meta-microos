SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPICalendar5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "76f2d691825b968aa777a8245de43da50a3f594a1f388be94eb4f6218de19f99d14735d52b0db638cf34c52d17632a2083c6ad8c2e02fb65c3c3b057a869cc42"

RPROVIDES:${PN} += "libKPim5GAPICalendar.so.5()(64bit) \
libKPim5GAPICalendar5 \
libKPim5GAPICalendar5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKPim5GAPICore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
