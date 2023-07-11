SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPICalendar5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6e768b4ba264d60055a7e8d93be48d64d844937f4b00187dd4455df080f3d325292e3618621e5b4444743a4f9305a7f1ffbc460a57ba33f447397ff39b09d1db"

RPROVIDES:${PN} += "libKPim5GAPICalendar.so.5 \
libKPim5GAPICalendar5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
