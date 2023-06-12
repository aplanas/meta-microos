SUMMARY = "Development package for the KDEPIM Calendarsupport library"
DESCRIPTION = "The development package for the calendarsupport libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "calendarsupport-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3c0b7a0197d36a69c64597c75627fd4927db4fe1f6a63d0088b03dd363b2b5919ffa440d834fe9daf0ee90e5ceeb379a1b53ee399a609a1dd545fad3d4801d5f"

RPROVIDES:${PN} += "calendarsupport-devel calendarsupport-devel(aarch-64) cmake(KF5CalendarSupport) cmake(KPim5CalendarSupport)"
RDEPENDS:${PN} += "cmake(KPim5AkonadiCalendar) cmake(KPim5IdentityManagement) cmake(KPim5Mime) cmake(Qt5PrintSupport) libKPim5CalendarSupport5"

inherit rpm
