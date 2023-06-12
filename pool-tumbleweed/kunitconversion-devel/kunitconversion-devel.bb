SUMMARY = "Converting physical units: Build Environment"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons). \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kunitconversion-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "16c3153745dfd9ff666c89e4a3ae415947c6285cde75c81282ff17ce46a8542d63cd64ab3ae72f6c965c0db93a1e753011c570d8a7e5e83fe3b3a83de27a3290"

RPROVIDES:${PN} += "cmake(KF5UnitConversion) \
kunitconversion-devel \
kunitconversion-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
extra-cmake-modules \
libKF5UnitConversion5"

inherit rpm
