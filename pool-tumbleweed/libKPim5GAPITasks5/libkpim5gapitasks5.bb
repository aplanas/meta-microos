SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPITasks5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "785cd4836d5f1de6323253faedfe04792b68753cec1c1394379bd756a83cbc36ea37bff54b24eced45b0c35b92b74bf24e15084a1cfe9b04c5256b47a66d3adb"

RPROVIDES:${PN} += "libKPim5GAPITasks.so.5()(64bit) \
libKPim5GAPITasks5 \
libKPim5GAPITasks5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKPim5GAPICore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
