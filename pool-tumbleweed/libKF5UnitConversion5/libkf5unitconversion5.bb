SUMMARY = "Converting physical units"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5UnitConversion5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "46355e1b7a46428ecc30605fe85d4363ff421740f5ae27216767d4ca739c4e3a4a6a4f5bf2a995178f03fb0a61b5085a86eff6b2f9a8776a7b998778000792d5"

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
