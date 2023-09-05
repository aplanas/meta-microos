SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPILatitude5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b729c19e2ae6ac1cfdd446376dc9e2448d5b717a2501a3dc0c34789b962006a7d3ca5db5eba3d95037fb8179496bb880de72b17b27092beef3294c429cdf0e09"

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
