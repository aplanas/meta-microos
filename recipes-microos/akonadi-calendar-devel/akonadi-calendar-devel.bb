SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "Development package for akonadi-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-calendar-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8e5a18f226ea3be8b1418cfd9f8bd64b266dc0915061597ffc446b104b70f9dd120f4230f93ce1e0a3e4a621fec8359cb82d1707348c1bbd041f43654f9e2395"

RPROVIDES:${PN} += "akonadi-calendar-devel akonadi-calendar-devel(aarch-64) akonadi5-calendar-devel cmake(KF5AkonadiCalendar) cmake(KPim5AkonadiCalendar)"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KF5I18n) cmake(KF5WidgetsAddons) cmake(KPim5Akonadi) libKPim5AkonadiCalendar5"

inherit rpm
