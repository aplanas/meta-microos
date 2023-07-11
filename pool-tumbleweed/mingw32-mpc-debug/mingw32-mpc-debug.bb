SUMMARY = "Debug information for package mingw32-mpc"
DESCRIPTION = "This package provides debug information for package mingw32-mpc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-mpc-debug-1.0.2-3.3.noarch.rpm"
RPM_HASH = "41890cf5e92bac9d96bed4b772741da4b39e04bb60838e91cf6f4eee56c8108011dbcc4f2a9c1e0355c588fcb42b573b8f64d3d72525e80bdfe72be0b4b36d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-mpc-debug"

RDEPENDS:${PN} += ""

inherit rpm
