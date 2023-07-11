SUMMARY = "Debug information for package mingw64-winpthreads"
DESCRIPTION = "This package provides debug information for package mingw64-winpthreads. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw64-winpthreads-debug-10.0.0-1.8.noarch.rpm"
RPM_HASH = "4d2d81e6c906afd0b30436fbc9889f2818fce6c90313a7ddd954a32457d8db9c5b46907e1fcb60031d65099f96c67ab7796e82b7dc4258e4be6a6830f03ac1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-winpthreads-debug"

RDEPENDS:${PN} += ""

inherit rpm
