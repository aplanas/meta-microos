SUMMARY = "Shared library for stlink"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "libstlink1-1.7.0-2.7.aarch64.rpm"
RPM_HASH = "0d8f2a397fac97780e7d1298dcda5eb520681204a0c7d32ac30ad22c2a041c1c0d3f12db39b50f15d3abcce4ab366322e9ff5772f9a00b3f45c6483e6409e18e"

RPROVIDES:${PN} += "libstlink.so.1 \
libstlink1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
