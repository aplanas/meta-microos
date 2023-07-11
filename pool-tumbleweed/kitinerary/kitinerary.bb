SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kitinerary-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3bfd44a09a1cf2ac3f01544ddcc27f12e168311f86b7de4b8e225ff629903e6f2c74b60387b30129aad17c98468700935b787f89abfe30cd873c575e942ed1d8"

RPROVIDES:${PN} += "kitinerary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKPim5Itinerary.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
