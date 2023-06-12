SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKOpeningHours1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ebd160dd54b77a6cee9846be340c86f11c2a1d8ad01bf0f732222cb91d2d96ed52c7efed952729f23ef23dff817462c7db19b74a9b1997a316277c00a4832c45"

RPROVIDES:${PN} += "libKOpeningHours.so.1()(64bit) \
libKOpeningHours1 \
libKOpeningHours1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
