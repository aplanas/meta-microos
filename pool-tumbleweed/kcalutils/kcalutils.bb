SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kcalutils-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3057f3f3e5869fad92096dfcb5f7b15f8a1d5b1134808eb719ba95a77e678bc194f955d45d17cd6f1a9efc02bbc375502f2177242debf1386310e2f572a2dfab"

RPROVIDES:${PN} += "kcalutils"

RDEPENDS:${PN} += "grantlee5 \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5IconThemes.so.5 \
libKPim5CalendarUtils.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
