SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "mingw64-cross-ctest-1.1.5-1.1.noarch.rpm"
RPM_HASH = "e8d20875f2b0ba02b09b88ba83ea3b116ac534d0e2f23d4d8b9dfa85d3981848e4a2fc0b833e65f17f256ebc5fb58cdff9f8aea703d845707ea48e7f2af29b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-ctest"

RDEPENDS:${PN} += "mingw64-cross-cmake \
mingw64-cross-wine"

inherit rpm
