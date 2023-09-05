SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPICalendar5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7bf191435fbd23a8235f6d9fcdcf2f97b473034a06ab4bdad80d8d26801740cff73a42da3ac987bdd6a761d3a261cd41a04121e875fb415dde75cd166beb39f7"

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
