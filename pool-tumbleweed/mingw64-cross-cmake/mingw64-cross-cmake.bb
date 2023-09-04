SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "mingw64-cross-cmake-1.1.5-1.1.noarch.rpm"
RPM_HASH = "3caed19279a3eb892c0c1afcddcdc765911999f5c140a67087ba1c3d4f68914eac2852d3165c0a2713138d007ce525e04de0ab5b1446a25d87d2f8b64bc98e43"
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
