SUMMARY = "Debug information for package mingw32-mpfr"
DESCRIPTION = "This package provides debug information for package mingw32-mpfr. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-mpfr-debug-3.1.2-2.14.noarch.rpm"
RPM_HASH = "0398158bfde5e58d795d06ce145f3b26d3159cc8ff61a90d5edaba2ebd3558f9ee90cd88c07cdc63208a1a4fb6bb932ac6d61cd11821d212c780563ea0eb9e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-mpfr-debug"

RDEPENDS:${PN} += ""

inherit rpm
