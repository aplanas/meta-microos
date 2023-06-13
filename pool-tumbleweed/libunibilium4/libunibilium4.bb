SUMMARY = "A terminfo parsing library"
DESCRIPTION = "Unibilium is a very basic terminfo library. It doesn't depend on curses or any \
other library. It also doesn't use global variables, so it should be \
thread-safe. \
 \
This package holds the shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libunibilium4-2.1.1-1.7.aarch64.rpm"
RPM_HASH = "c957f67a90a011e70783198deeaf33b089614c3aed9ff2c8e376b3553b90524238690102e429a9a76f223f4df1031e485f52787ece9fede2f1fcc42d9747fa83"

RPROVIDES:${PN} += "libunibilium.so.4()(64bit) \
libunibilium4 \
libunibilium4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
