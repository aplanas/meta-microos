SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPITasks5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "785cd4836d5f1de6323253faedfe04792b68753cec1c1394379bd756a83cbc36ea37bff54b24eced45b0c35b92b74bf24e15084a1cfe9b04c5256b47a66d3adb"

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
