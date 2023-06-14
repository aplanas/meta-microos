SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications. \
This package contains the library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Itinerary5-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "cbf797404cff5cffb9f4ad1b5be006f284bdeca4c83c9d18be37d9b5f6637831d2c00d4510a017b0f5862de023349655f8d30be30666d2b279c9a9af7c25e480"

RPROVIDES:${PN} += "libKPim5Itinerary.so.5 \
libKPim5Itinerary5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5Contacts.so.5 \
libKF5I18n.so.5 \
libKF5I18nLocaleData.so.5 \
libKPim5Mime.so.5 \
libKPim5PkPass.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libZXing.so.3 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libphonenumber.so.8 \
libpoppler.so.128 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
