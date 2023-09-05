SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKOpeningHours1-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "64ac6b89c7542b1a08f3e17f6233e5a0f8a25635736c734e911b80bc82b067b238ebfa70bf740a0de676bc30810d9c25db286edb1deaff03706c883096f7d83a"

RPROVIDES:${PN} += "libKOpeningHours.so.1 \
libKOpeningHours1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
