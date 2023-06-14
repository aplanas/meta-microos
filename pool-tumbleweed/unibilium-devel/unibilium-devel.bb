SUMMARY = "Development files for unibilium, a terminfo parsing library"
DESCRIPTION = "Unibilium is a very basic terminfo library. It doesn't depend on curses or any \
other library. It also doesn't use global variables, so it should be \
thread-safe. \
 \
This package holds the development files."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "unibilium-devel-2.1.1-1.7.aarch64.rpm"
RPM_HASH = "dc0f90ff60fc16dea8779ba00a8696aaa54c6736caf85d4f310529cd8c4d39797f4aeaf3903c8abbcf004755e23141a3b9cfa0e78b95ce0609c21ca61755a41e"

RPROVIDES:${PN} += "pkgconfig-unibilium \
unibilium-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunibilium4"

inherit rpm
