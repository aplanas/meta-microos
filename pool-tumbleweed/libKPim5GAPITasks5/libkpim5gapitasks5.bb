SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPITasks5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a3fa28c474536fb0e26bbb6ef7f873c22ecb736e6585ff839d2dd6f07c100208c8371fb0ccef6ed2fd9f4f13b613467a8bce06435110cc1d462be09068343f02"

RPROVIDES:${PN} += "libKPim5GAPITasks.so.5 \
libKPim5GAPITasks5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
