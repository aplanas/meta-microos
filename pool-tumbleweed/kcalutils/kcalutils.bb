SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kcalutils-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7ef937578e45ea87d079f34b70bf6e260b42f4ff138623ef36a49633e386a62fa7b0d7e1f0fbe96753f83cd67401ccf6b35f69073c61f4672c627e8a46f1bf72"

RPROVIDES:${PN} += "kcalutils \
kcalutils(aarch-64)"

RDEPENDS:${PN} += "grantlee5 \
ld-linux-aarch64.so.1()(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
