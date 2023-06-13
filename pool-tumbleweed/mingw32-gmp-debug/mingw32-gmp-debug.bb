SUMMARY = "Debug information for package mingw32-gmp"
DESCRIPTION = "This package provides debug information for package mingw32-gmp. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-gmp-debug-6.1.1-3.11.noarch.rpm"
RPM_HASH = "ad0ab769b69291312bda39c1e05fd24dfe9ad3fe90514d3be923ac9fa9d7d77716954475e0a66522dc35cf530bb28aef0f79d1645785b412fadf2821b4a2ef54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gmp-debug"

RDEPENDS:${PN} += ""

inherit rpm
