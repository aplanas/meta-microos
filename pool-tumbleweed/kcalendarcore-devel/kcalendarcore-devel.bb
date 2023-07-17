SUMMARY = "Development files for kcalendarcore, a library to handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP. This package contains the headers necessary to \
develop applications making use of KCalendarCore."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kcalendarcore-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6828ae7d0e407936b77223130fba36d9a0b83d639930a440d83445a39d8fde0ffb5f32ef74e20ac503f6f504e2d09db9d0de980fd1dd596eba785babdec53359"

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
