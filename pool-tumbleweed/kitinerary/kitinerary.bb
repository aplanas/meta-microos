SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kitinerary-23.04.3-1.2.aarch64.rpm"
RPM_HASH = "7127e2b0793417b3e9f0062b6d85b66e4d1ad1f91d19d4982cf1244c2afa6d4577a049eede2bea4ff8b8c069cd5845e3ff764040c69b4e8937372ca5a1ee7f5f"

RPROVIDES:${PN} += "kitinerary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKPim5Itinerary.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
