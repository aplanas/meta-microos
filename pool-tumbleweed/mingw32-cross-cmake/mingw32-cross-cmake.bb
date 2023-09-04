SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "mingw32-cross-cmake-1.1.5-1.1.noarch.rpm"
RPM_HASH = "e5ebc82ec0fc83527d4baf3e1b888705cde780202ad1e93a49d1cf6ab6c5c520184a5728695d119ee604677047b8d611a52302c9a75f9d8273e204f792d080a8"
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
