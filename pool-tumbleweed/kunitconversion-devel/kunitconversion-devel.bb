SUMMARY = "Converting physical units: Build Environment"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons). \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kunitconversion-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0303f021a7be8aacbb3676c4fc30545a051e54b3929c9256c48b7db1111d9daafeae2401f96aa141bc46c3f2a72ffff886c82f1d503e839379dedbd91e4732ea"

RPROVIDES:${PN} += "cmake-KF5UnitConversion \
kunitconversion-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5UnitConversion5"

inherit rpm
