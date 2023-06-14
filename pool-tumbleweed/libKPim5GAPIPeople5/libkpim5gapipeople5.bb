SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GAPIPeople5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "bb8ca7903619b636b94118868d3a88005ba98cf25c44d59513ab382d34464c8cb212e69d59ba5c236db8e2c2008a2defff7a975f27f8affdf10c843bf618902a"

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
