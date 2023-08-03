SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "mingw64-cross-ctest-1.1.4-1.1.noarch.rpm"
RPM_HASH = "2f427d3b55143ea0de22d5715b47a51fb177e75dd3f01f1cdbd39a6e848f776e63a851f1209fb2924e2ada4295878ab01232ec116913f4ffca60bcd3cc6232ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-ctest"

RDEPENDS:${PN} += "mingw64-cross-cmake \
mingw64-cross-wine"

inherit rpm
