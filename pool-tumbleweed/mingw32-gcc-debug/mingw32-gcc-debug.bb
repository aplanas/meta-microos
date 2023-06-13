SUMMARY = "Debug information for package mingw32-gcc"
DESCRIPTION = "This package provides debug information for package mingw32-gcc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-debug-12.2.0-2.1.noarch.rpm"
RPM_HASH = "c5cee6fc008a2512ba71a4390799fa6ed2476289dd46e4d188ba69ffc7382e240d201790500b2c031a93fcb05038a50f51336fa9b4ce74cc529332960be03a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gcc-debug"

RDEPENDS:${PN} += ""

inherit rpm
