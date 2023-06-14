SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "mingw32-cross-cmake-1.0.0-1.1.noarch.rpm"
RPM_HASH = "dbd85f027a52cc003843e12ae46c3afeb7946ba235cea66f4d36ea54bdb623928f054007b1f7e6110bd7c4b11da164e170d975fbee7483af7a5db11d8bbdbe9d"
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
