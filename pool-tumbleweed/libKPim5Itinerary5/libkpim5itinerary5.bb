SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications. \
This package contains the library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Itinerary5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "670e64488fc8b9baf27e09516f07bdbee5137a4be5f895f5a24fe51f9e36d73290d15762e4b4fab4c13338e109f9d7be9d003f348bf0a94e3eb512322afa9f3f"

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
libpoppler.so.129 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
