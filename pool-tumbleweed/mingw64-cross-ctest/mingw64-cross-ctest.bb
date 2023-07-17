SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "mingw64-cross-ctest-1.1.3-1.1.noarch.rpm"
RPM_HASH = "12d315e73907e85a55fa626275c230ced789083e97dcf5c666cce616eca001b23a8fbd78605c5fc5d344ce4778f4bb4a46241a076f4fed551bf9479db1abdfb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-ctest"

RDEPENDS:${PN} += "mingw64-cross-cmake \
mingw64-cross-wine"

inherit rpm
