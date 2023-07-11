SUMMARY = "Development files for kcalendarcore, a library to handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP. This package contains the headers necessary to \
develop applications making use of KCalendarCore."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kcalendarcore-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8ce262a805a28a9c8dc1721dde8a78f1e5b7f8d529a5c26f2c215db4adc3b37685ca9302ee9280a98693017e2ea6b4e48b2dd0e834e2110ef83ab42f7b7d6339"

RPROVIDES:${PN} += "cmake-KF5CalendarCore \
kcalcore-devel \
kcalcore5-devel \
kcalendarcore-devel \
pkgconfig-KF5CalendarCore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-LibIcal \
libKF5CalendarCore5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
