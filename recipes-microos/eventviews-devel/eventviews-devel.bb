SUMMARY = "Library for messages"
DESCRIPTION = "The development package for the eventviews libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "eventviews-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b604bdd30a85ec55f385d5e45cfa59a628ff8a1fb43cd9c78fcc6034cede6449aef993bfb6b2f57bac33ac61b4a0d6d0233649f4201462944eee299e0dea11b9"

RPROVIDES:${PN} += "cmake(KF5EventViews) cmake(KPim5EventViews) eventviews-devel eventviews-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KPim5Akonadi) cmake(KPim5AkonadiCalendar) cmake(KPim5CalendarSupport) cmake(KPim5CalendarUtils) libKPim5EventViews5"

inherit rpm
