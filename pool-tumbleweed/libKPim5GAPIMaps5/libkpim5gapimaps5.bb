SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GAPIMaps5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3bdfa8541741b009e8f8da988bcaf09c4524ffe5fcda9abff56ffe54e366aab31080f74eaefacc8af646613697948c16921e49b9211bfcce75e01abe84ce2494"

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
