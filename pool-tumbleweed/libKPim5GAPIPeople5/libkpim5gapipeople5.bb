SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPIPeople5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "97feb19acae96bec8a185bec38f75164edaafda4ca0ac2251686557c22923a6051dc27b5707ca08c6cd7ceb4b0ab928e7cef942d21f5c14117e4ecfbdb5f5ee3"

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
