SUMMARY = "Debug information for package mingw64-mpfr"
DESCRIPTION = "This package provides debug information for package mingw64-mpfr. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-mpfr-debug-3.1.4-2.14.noarch.rpm"
RPM_HASH = "13796caf71fd937bcf245c527d19cebe280afcb76cec0fd49a69f2fc8a7ee8cf65f9246886e75f4dbb65054d0f443b1535f7f6796fbd9f1b27b4cb5c6bbaf838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-mpfr-debug"

RDEPENDS:${PN} += ""

inherit rpm
