SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKOpeningHours1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ebd160dd54b77a6cee9846be340c86f11c2a1d8ad01bf0f732222cb91d2d96ed52c7efed952729f23ef23dff817462c7db19b74a9b1997a316277c00a4832c45"

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
