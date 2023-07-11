SUMMARY = "Debug information for package mingw32-zlib"
DESCRIPTION = "This package provides debug information for package mingw32-zlib. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-zlib-debug-1.2.13-3.2.noarch.rpm"
RPM_HASH = "2864eddd5a011add242811e18a45b58406dc1772ca055a9aa3e2d360a645b37953cd87db0a0a8015391d7f161d0f5585f23c13bb0ef64d9c6a30fe23c9a2b23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-zlib-debug"

RDEPENDS:${PN} += ""

inherit rpm
