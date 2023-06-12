SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "mingw32-cross-ctest-1.0.0-1.1.noarch.rpm"
RPM_HASH = "ca1e7f4a7577dd64bfe41e76c329a15eca496910fdf51f889b05f83186ff16b984382daf21cc192aebaf2e94f7e3bbf017618aaed4eea7392c125e4a8745dca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-ctest"
RDEPENDS:${PN} += "mingw32-cross-cmake \
mingw32-cross-wine"

inherit rpm
