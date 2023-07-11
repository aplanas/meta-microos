SUMMARY = "Debug information for package mingw64-binutils"
DESCRIPTION = "This package provides debug information for package mingw64-binutils. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-binutils-debug-2.39-4.5.noarch.rpm"
RPM_HASH = "d388bb3c82413e46d8ac2179e62a03f39e50dbe379a26123ccb2fab27f29e4960c1d3852ae091f6195d3412fa8301b31e44baa43e4552d77e49f1ded11f824bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils-debug"

RDEPENDS:${PN} += ""

inherit rpm
