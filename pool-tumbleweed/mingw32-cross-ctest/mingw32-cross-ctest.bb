SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "mingw32-cross-ctest-1.1.5-1.1.noarch.rpm"
RPM_HASH = "53808549cf35bd6f48e58caa32431e7d1bcc9ce0ca22b7be9fe9e18d29e31ce40fd9cc174a7f98afee00da18834f9e3324eeb6627120c31ecb8910530024c609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-ctest"

RDEPENDS:${PN} += "mingw32-cross-cmake \
mingw32-cross-wine"

inherit rpm
