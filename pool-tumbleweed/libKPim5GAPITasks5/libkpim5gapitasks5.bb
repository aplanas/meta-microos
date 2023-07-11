SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPITasks5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3567c4994c79574eda6f84da3c15105fd5124e435fc6f7935a28b3ca57bfe85c27ad8c94b8830c18f597550c3c2d81ae04936a7606315acb9324378c27bd7571"

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
