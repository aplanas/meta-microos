SUMMARY = "Debug information for package mingw64-gcc"
DESCRIPTION = "This package provides debug information for package mingw64-gcc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-gcc-debug-12.2.0-3.1.noarch.rpm"
RPM_HASH = "606ce3351a42a50e445cf82a5b64a3080ab5fce1198a9327576e69c789f5a0ce7dc4fb36283a7685e820a3d8f5ed008e30036dff7f529251c6638b8c46823f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gcc-debug"

RDEPENDS:${PN} += ""

inherit rpm
