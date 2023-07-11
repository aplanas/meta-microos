SUMMARY = "Converting physical units: Build Environment"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons). \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kunitconversion-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "10070dc403bb376354ed8049cf0cb093800d00891fe6385039522e88b1a6863aa3f8b1abc8c414268e325e57ffc1a421ef5bdc474dafc070030e1b75c307a15a"

RPROVIDES:${PN} += "cmake-KF5UnitConversion \
kunitconversion-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5UnitConversion5"

inherit rpm
