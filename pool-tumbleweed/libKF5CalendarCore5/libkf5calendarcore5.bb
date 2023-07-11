SUMMARY = "Library to access to and handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5CalendarCore5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "511ae3e78142320e8d835ed8331573e1acc5e218412657a14f33a1a17778dd62a43081af7cfde581d9280498f2287065700adb5f943d42f5538db04de6b48d54"

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
