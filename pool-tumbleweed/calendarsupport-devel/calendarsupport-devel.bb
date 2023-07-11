SUMMARY = "Development package for the KDEPIM Calendarsupport library"
DESCRIPTION = "The development package for the calendarsupport libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "calendarsupport-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c3efa1d54b7db43bd6d1f9d708e6ebae3819b9d90ece6945292436bc49f7c4346ed9493b0f0322026b186d759b941726cc780f2f64e293dd28476619bc112ad8"

RPROVIDES:${PN} += "calendarsupport-devel \
cmake-KF5CalendarSupport \
cmake-KPim5CalendarSupport"

RDEPENDS:${PN} += "cmake-KPim5AkonadiCalendar \
cmake-KPim5IdentityManagement \
cmake-KPim5Mime \
cmake-Qt5PrintSupport \
libKPim5CalendarSupport5"

inherit rpm
