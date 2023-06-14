SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPILatitude5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6227ce192f23685e73fdd17c582f0ce9cf9115d721b8ac5c4eb15e3d9c2cdbe794d62910aa81e05ebc03d4063960204cd328cd8290c1946a10c45baa45154e21"

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
