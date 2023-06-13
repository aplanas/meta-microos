SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "Development package for akonadi-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-calendar-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "840e24dc3b0b495e0856d43185fb7308ca1504ac471759bc49f3918454f02344906069f2ee3d4b6669dd7ef7827cc0bbbcedb8b14bcbfda12bbe04dfc9a56b9e"

RPROVIDES:${PN} += "akonadi-calendar-devel \
akonadi-calendar-devel(aarch-64) \
akonadi5-calendar-devel \
cmake(KF5AkonadiCalendar) \
cmake(KPim5AkonadiCalendar)"

RDEPENDS:${PN} += "cmake(KF5CalendarCore) \
cmake(KF5I18n) \
cmake(KF5WidgetsAddons) \
cmake(KPim5Akonadi) \
libKPim5AkonadiCalendar5"

inherit rpm
