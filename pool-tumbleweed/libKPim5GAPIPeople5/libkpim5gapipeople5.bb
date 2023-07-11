SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPIPeople5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ba947e294fc543a89bb6fcf26f85f5179154ea649fb917a29c7a2411c004b2b7321e975f13d0690a8e971f07c0d52d18f986129832a2448720e472b7aa93faf2"

RPROVIDES:${PN} += "libKPim5GAPIPeople.so.5 \
libKPim5GAPIPeople5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Contacts.so.5 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
