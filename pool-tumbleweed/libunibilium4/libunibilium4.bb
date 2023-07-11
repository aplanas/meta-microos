SUMMARY = "A terminfo parsing library"
DESCRIPTION = "Unibilium is a very basic terminfo library. It doesn't depend on curses or any \
other library. It also doesn't use global variables, so it should be \
thread-safe. \
 \
This package holds the shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libunibilium4-2.1.1-1.8.aarch64.rpm"
RPM_HASH = "c24b67045e343fbc907aafdd8589d0b5217c64cf5ef80c179ce2cf6b4544f68c9a919c82f346fd26abb67b1d13a2ee6b5196c9cf187764a66d5c3fd4d9d1a174"

RPROVIDES:${PN} += "libunibilium.so.4 \
libunibilium4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
