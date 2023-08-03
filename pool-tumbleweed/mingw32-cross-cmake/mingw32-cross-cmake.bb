SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "mingw32-cross-cmake-1.1.4-1.1.noarch.rpm"
RPM_HASH = "893a6e1d1e79dbd44c5744fb51b0cd77458c2e050181b0ff880f001a3eb692bd6f96e71c2e380678a4e1198c93ef7cb3e49dc9d76adebfce628c30ae0e8c6c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-cmake \
rpm-macro--mingw32-cmake \
rpm-macro--mingw32-cmake-build \
rpm-macro--mingw32-cmake-install \
rpm-macro--mingw32-ctest"

RDEPENDS:${PN} += "/usr/bin/python3 \
cmake \
mingw32-filesystem"

inherit rpm
