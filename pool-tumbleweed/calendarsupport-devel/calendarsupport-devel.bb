SUMMARY = "Development package for the KDEPIM Calendarsupport library"
DESCRIPTION = "The development package for the calendarsupport libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "calendarsupport-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ce7b6223d362035d0a1a75a423fd1bdde1b9f6285f0db57b5739a1f91c4c5b2becd0712a98482c28fd4acaeb31e07d358564a8597c5fc7bf36707bfcb68d258c"

RPROVIDES:${PN} += "calendarsupport-devel \
cmake-KF5CalendarSupport \
cmake-KPim5CalendarSupport"

RDEPENDS:${PN} += "cmake-KPim5AkonadiCalendar \
cmake-KPim5IdentityManagement \
cmake-KPim5Mime \
cmake-Qt5PrintSupport \
libKPim5CalendarSupport5"

inherit rpm
