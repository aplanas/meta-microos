SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "mingw64-cross-cmake-1.1.2-1.1.noarch.rpm"
RPM_HASH = "9c056001893a4784049a487e2d7b5c3ee173924766b33405f5626b9bc7ea88b1b44b17be82fb3895c6c42a889829905a3fc6654d67f3ce9e7c34cf8bbb000a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-cmake \
rpm-macro--mingw64-cmake \
rpm-macro--mingw64-cmake-build \
rpm-macro--mingw64-cmake-install \
rpm-macro--mingw64-ctest"

RDEPENDS:${PN} += "/usr/bin/python3 \
cmake \
mingw64-filesystem"

inherit rpm
