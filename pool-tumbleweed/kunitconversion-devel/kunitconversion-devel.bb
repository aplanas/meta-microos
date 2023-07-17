SUMMARY = "Converting physical units: Build Environment"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons). \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kunitconversion-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c151aa158a5a79ab01304561b19bf23fc4eec0f710f4af6d88c21b8fe3b2ea3eb99c9a9320d315312d734554c840897e88d12b9d59a29806ef29db01a1c11d96"

RPROVIDES:${PN} += "cmake-KF5UnitConversion \
kunitconversion-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5UnitConversion5"

inherit rpm
