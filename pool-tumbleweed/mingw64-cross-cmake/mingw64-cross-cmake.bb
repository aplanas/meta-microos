SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "mingw64-cross-cmake-1.1.3-1.1.noarch.rpm"
RPM_HASH = "0c32a38bd54d3ea27e5475e62865f10980d9bb82c718548d0b309c3b1c2324c1b5aa1756d60f7b9b93cde81ea47a567430d299d1b84ab820b0f21144c33bd2f8"
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
