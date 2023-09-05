SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kitinerary-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0d7536ad310144b74be0cd992ddb766d87844ce3941b56688430ef4bdebf72b6f8a81aa196a6dea61e3ef7c5dc8e361d91e4b1cc99753fc358fa037cb0ab0cd7"

RPROVIDES:${PN} += "kitinerary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKPim5Itinerary.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
