SUMMARY = "Converting physical units"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5UnitConversion5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "964726af50f9f4cdedb695cc9ac86277826d0acc4e5aa0100e2f054d6ad5f58a69f59fcf0902c6354c45c01c48c2d7fd819ee56d8c68ec585bcffa49ff6d6c5a"

RPROVIDES:${PN} += "libKF5UnitConversion.so.5 \
libKF5UnitConversion5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
