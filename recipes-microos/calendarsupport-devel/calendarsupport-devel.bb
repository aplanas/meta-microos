SUMMARY = "Development package for the KDEPIM Calendarsupport library"
DESCRIPTION = "The development package for the calendarsupport libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "calendarsupport-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "31fded435094d7697780d0559af9c079c131c782bedef5e68a34bacc1da39fc75e779bfcc6ce0f5b9a3e018f00412df9c2f596c05bf57216bf4d36b6eb78783e"

RPROVIDES:${PN} += "calendarsupport-devel calendarsupport-devel(aarch-64) cmake(KF5CalendarSupport) cmake(KPim5CalendarSupport)"
RDEPENDS:${PN} += "cmake(KPim5AkonadiCalendar) cmake(KPim5IdentityManagement) cmake(KPim5Mime) cmake(Qt5PrintSupport) libKPim5CalendarSupport5"

inherit rpm
