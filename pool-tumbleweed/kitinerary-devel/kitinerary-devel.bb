SUMMARY = "Development files for kitinerary"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the kitinerary library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kitinerary-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "844182a863bc2ddb9eb06df66cef1e634c83eb07fcda1eff522372e84eb89184777256fea55b1f3ac93a83e27befd8e3a60da1432682d1582081e748922e3127"

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
