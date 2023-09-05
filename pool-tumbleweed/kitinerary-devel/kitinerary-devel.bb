SUMMARY = "Development files for kitinerary"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kitinerary library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kitinerary-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b82cff9449173f9ca40c7c5cc28fabd21d723bd6acf6397c5d3b1d4c27941452707e7b6e07db99433b5cc8a6e123cd60c93ac4abfdb9af1f48c31b98e43eac01"

RPROVIDES:${PN} += "cmake-KPim5Itinerary \
cmake-KPimItinerary \
kitinerary-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KF5Contacts \
cmake-KF5Mime \
cmake-KPim5PkPass \
cmake-Qt5Gui \
libKPim5Itinerary5 \
libqt5-qtdeclarative-private-headers-devel"

inherit rpm
