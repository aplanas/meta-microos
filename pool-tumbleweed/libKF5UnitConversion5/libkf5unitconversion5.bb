SUMMARY = "Converting physical units"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5UnitConversion5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "8b1a0c3a44ecdcbb2ef52932dcb03c8bbf5fe2b7469061d5ad3749135274555e34bf95d48825580a4b37efcbb979bafd111cd22d917fb856bccea29b222d2341"

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
