SUMMARY = "Development files for kitinerary"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kitinerary library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kitinerary-devel-23.04.3-1.2.aarch64.rpm"
RPM_HASH = "1e51ec58a7920b8f8c4f874cc1f9e0c1b25befbea33216b6a892db8e9c7c9c85cef241155885a66dc4fefad9e31b8f702dde88e4ed57f4284dcc6af840c6da2a"

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
