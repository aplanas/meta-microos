SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "Development package for akonadi-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-calendar-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b40888e9d79963cf0f085c30fe1530c8dace20b6ed1317360d3d339ea27ae17f967273a4d08bfce6223368804b348c40e05b4a2e309c6b725ceab0370673d3fd"

RPROVIDES:${PN} += "akonadi-calendar-devel \
akonadi5-calendar-devel \
cmake-KF5AkonadiCalendar \
cmake-KPim5AkonadiCalendar"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KF5I18n \
cmake-KF5WidgetsAddons \
cmake-KPim5Akonadi \
libKPim5AkonadiCalendar5"

inherit rpm
