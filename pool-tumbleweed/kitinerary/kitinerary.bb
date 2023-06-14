SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kitinerary-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "01f14afc9ba2333d7ef4e9bf786f5b8ca0f5de1a3d24c34785c789395277f1cdc020752fb995e088e550e9b79b9a7ead88f4efe8d8dee8f67bb334cdc55add8f"

RPROVIDES:${PN} += "kitinerary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKPim5Itinerary.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
