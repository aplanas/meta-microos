SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GAPILatitude5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cfa0f49bdda1c4bb5d2b4c20c8ddb82cf57b1b1252c857ba18557e5454cdb8628e529b80f587cbf1fa9737548868aef93b028452b5efcab85a7db56f10507beb"

RPROVIDES:${PN} += "libKPim5GAPILatitude.so.5 \
libKPim5GAPILatitude5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Contacts.so.5 \
libKPim5GAPICore.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
