SUMMARY = "Development files for kcalendarcore, a library to handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP. This package contains the headers necessary to \
develop applications making use of KCalendarCore."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kcalendarcore-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "60bdbb22db59440e37995dd4d6b311877a81d2c98ffca13fbd71e99f002ac61273b2f1ed20c86ff1bb30d4594d3c323326ed4e075f9d91b8a2d7dbd3b6c36139"

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
