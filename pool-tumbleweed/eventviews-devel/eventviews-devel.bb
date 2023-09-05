SUMMARY = "Library for messages"
DESCRIPTION = "The development package for the eventviews libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "eventviews-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a192125492ee43934db450490472f943b32ac51249a72197a91cea77b252f64576f049f35c589a0c5b95809af71c10a67c04775fc7717c2423040a41ae5f2ab0"

RPROVIDES:${PN} += "cmake-KPim5EventViews \
eventviews-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiCalendar \
cmake-KPim5CalendarSupport \
cmake-KPim5CalendarUtils \
libKPim5EventViews5"

inherit rpm
