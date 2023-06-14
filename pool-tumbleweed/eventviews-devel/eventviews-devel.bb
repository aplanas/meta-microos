SUMMARY = "Library for messages"
DESCRIPTION = "The development package for the eventviews libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "eventviews-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "335505f03577c57260d08e8a9333435355bf5f512c84c90384dd5be93d585134c182b90a85d88b3789ee03950c0b91320e01c2d4216be31c4f5b640799f075f2"

RPROVIDES:${PN} += "cmake-KF5EventViews \
cmake-KPim5EventViews \
eventviews-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiCalendar \
cmake-KPim5CalendarSupport \
cmake-KPim5CalendarUtils \
libKPim5EventViews5"

inherit rpm
