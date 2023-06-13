SUMMARY = "Debug information for package mingw64-binutils"
DESCRIPTION = "This package provides debug information for package mingw64-binutils. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-binutils-debug-2.39-4.3.noarch.rpm"
RPM_HASH = "6ff1505ba4836b6af6e9f87a7b8897fb22ed97ee4edd244d3d126704ff025d984a7948d80cba1b81340abe64ea5824f53be09c2b8ff4b1e3e40b28cdeb2de651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils-debug"

RDEPENDS:${PN} += ""

inherit rpm
