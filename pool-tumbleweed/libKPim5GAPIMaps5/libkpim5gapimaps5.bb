SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPIMaps5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b6cc955f1ff4b383fe4c0a4a9bcdc671b9e37b12e743873aba81549f4386cc6809d8f2ae3410502bad3c10789ae99ebbdf59341ea7c3feebf85511c1cd371e34"

RPROVIDES:${PN} += "libKPim5GAPIMaps.so.5 \
libKPim5GAPIMaps5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Contacts.so.5 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
