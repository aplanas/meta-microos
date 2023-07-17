SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "mingw32-cross-cmake-1.1.3-1.1.noarch.rpm"
RPM_HASH = "1544727b71de56a71698d935c447d85e3b2a88cfd81872635b9f3814f5a981d94a063089e9e072f2e54f296af437b732f4fe28b83b9e071987dd2afaea384454"
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
