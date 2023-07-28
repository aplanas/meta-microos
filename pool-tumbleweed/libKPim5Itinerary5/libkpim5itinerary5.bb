SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications. \
This package contains the library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Itinerary5-23.04.3-1.2.aarch64.rpm"
RPM_HASH = "19dd80a6ce661966e62864f4602f95895867bb9639c981afab3a184916ac8349db136bf14e7542e9e0cd6d53787480a7a3d59a38744c375639060a0eb2125c9c"

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
libpoppler.so.130 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
