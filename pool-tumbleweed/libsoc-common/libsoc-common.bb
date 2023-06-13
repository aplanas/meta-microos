SUMMARY = "Common files for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
It targets reliability rather than speed. No guarantees are made \
on its determinism and it should not be used in time critical routines. \
 \
This package contains common config files for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc-common-0.8.2-3.13.aarch64.rpm"
RPM_HASH = "23bed5630acf2dc13eb2603b28a5bdcc3c91fd295c9045b00d37063c6d9a319778e1b5ba382cccab4a3f47cca9585498dd440a25317764e5d460c2360d8b901d"

RPROVIDES:${PN} += "libsoc-common \
libsoc-common(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
