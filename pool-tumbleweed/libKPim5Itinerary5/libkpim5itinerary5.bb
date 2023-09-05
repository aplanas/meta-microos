SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications. \
This package contains the library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Itinerary5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "66d5f3dd3cc80f69c70f75492bc51397685719d11f5000c7ebbc6a6d56f27390ccb7ed47a25f99e7f56397adcc10f0d93404ccdde7b68f7d4494341974e9ff3b"

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
libQt5Network.so.5 \
libQt5Qml.so.5 \
libZXing.so.3 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libphonenumber.so.8 \
libpoppler.so.130 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
