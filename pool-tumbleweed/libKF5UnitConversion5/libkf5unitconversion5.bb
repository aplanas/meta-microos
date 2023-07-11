SUMMARY = "Converting physical units"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5UnitConversion5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "77520083e5f1c39ef549287ee73be165fc5b86d7397524b8c7e808313cc615ac7d6e7432dc524d5057b11680e90ae874463a966952ef4dba331e64538b40b5b2"

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
