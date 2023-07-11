SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "Development package for akonadi-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-calendar-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "df4438e1360099a983816f18816831cd391533eac415b0963d434e03f64d4972cfb270ab86e23a62ade60dc40acc320ded1e1a78ff9ffdcc5aa1595753b2d53d"

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
