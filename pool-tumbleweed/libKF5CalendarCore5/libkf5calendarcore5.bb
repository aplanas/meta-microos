SUMMARY = "Library to access to and handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5CalendarCore5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "9b2411af59ea8c3847eae017e6c1beb0be54e083968ecbf3bfef42e7d3a1549a278b827f2e647485c4b11bb4fb7636ba35f0580fa9b4c18ba0182be513972728"

RPROVIDES:${PN} += "libKF5CalendarCore.so.5 \
libKF5CalendarCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libical.so.3 \
libicalss.so.3 \
libicalvcal.so.3 \
libstdc++.so.6"

inherit rpm
