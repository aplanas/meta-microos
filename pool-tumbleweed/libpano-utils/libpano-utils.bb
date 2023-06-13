SUMMARY = "Panorama Tools Utilities"
DESCRIPTION = "Utilities for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.21"

RPM_NAME = "libpano-utils-2.9.21-1.8.aarch64.rpm"
RPM_HASH = "06d736298a16b8b06abb9f6e9445e49af27328cec6042975ed23bb187f1a12246a05cc70657f679738d25c2d2708cff6233352e85266870b3c61ffedbd74cd22"

RPROVIDES:${PN} += "libpano-utils \
libpano-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpano13.so.3()(64bit)"

inherit rpm
