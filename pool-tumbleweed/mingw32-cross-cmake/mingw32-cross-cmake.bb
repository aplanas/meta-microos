SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "mingw32-cross-cmake-1.1.2-1.1.noarch.rpm"
RPM_HASH = "6c226672e1a9ec520622e05c3431a020c5de66d9d46cf91645791ca13ac03912432b46f620e27a59ccfeda9ea3877e1726a75a22bc0a0cab3eb3c394840efba5"
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
