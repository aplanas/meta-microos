SUMMARY = "Debug information for package mingw64-mpc"
DESCRIPTION = "This package provides debug information for package mingw64-mpc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-mpc-debug-1.0.2-3.1.noarch.rpm"
RPM_HASH = "882aef4343dedd3f0d8448cfdd2396f55ed44b9c0c475a8282f43d7f76cd9feaffcea40b43c517d56fc57364af73647fda561e7472eec15b55e6b07b93250f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-mpc-debug"

RDEPENDS:${PN} += ""

inherit rpm
