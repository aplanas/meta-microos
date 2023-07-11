SUMMARY = "Debug information for package mingw32-gmp"
DESCRIPTION = "This package provides debug information for package mingw32-gmp. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-gmp-debug-6.1.1-3.13.noarch.rpm"
RPM_HASH = "5aaffc9861e4437937e22bf5cc2310851de7f4e5468bb3d43145f4381fa672dbce1b07492119c401cb5f5cec722c5439fc67ff7484af27c66212f791d8056215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gmp-debug"

RDEPENDS:${PN} += ""

inherit rpm
