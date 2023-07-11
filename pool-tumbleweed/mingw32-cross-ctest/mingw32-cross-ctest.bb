SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "mingw32-cross-ctest-1.1.2-1.1.noarch.rpm"
RPM_HASH = "c5006bc6a4f6396dab58262462317172c93218b8e78d8b6005aaf6d1576fb8213b9c136e8c308ba9a588fa78c0a9178e0cd85034827731bbf81f84b4d98fe283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-ctest"

RDEPENDS:${PN} += "mingw32-cross-cmake \
mingw32-cross-wine"

inherit rpm
