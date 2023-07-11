SUMMARY = "Library for messages"
DESCRIPTION = "The development package for the eventviews libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "eventviews-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "7ac86327cb2570b814775485208ab0b16d19aec2376a6cb8a51170f08e11137a1c598c0d798630e1fd70a80a3bd360796adf9e3845dd3e142dd7ebb9d0411954"

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
