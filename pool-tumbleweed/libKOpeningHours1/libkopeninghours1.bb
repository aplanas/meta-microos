SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKOpeningHours1-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2bae79687ca8d9b334f3b1f82143b41d7629e0c01766e7eb1f0861caee3ee5f20ff9272fe211cd71f812afe69056ef9de1e0b028c219da6dcf9f5df2649ebc89"

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
