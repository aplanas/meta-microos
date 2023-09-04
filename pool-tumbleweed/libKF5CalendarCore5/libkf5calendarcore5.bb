SUMMARY = "Library to access to and handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5CalendarCore5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2461162b16322603c9fffc6a8d675bded486329a5b55e80814696002ce24039ab44dd4a599a9e3711368243689c6c72e370615fde00ba5bd5a44805b3595db39"

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
