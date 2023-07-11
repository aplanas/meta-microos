SUMMARY = "Debug information for package mingw64-mpc"
DESCRIPTION = "This package provides debug information for package mingw64-mpc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-mpc-debug-1.0.2-3.3.noarch.rpm"
RPM_HASH = "df2cf128e888d559e32236336d740100604eb2b6b67b90b508b8f9f44b7465fb3d07eb42505da7eabb8b8223c6bef727c2145c6f73ce98b4e692d16875ba3f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-mpc-debug"

RDEPENDS:${PN} += ""

inherit rpm
