SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "mingw64-cross-cmake-1.1.4-1.1.noarch.rpm"
RPM_HASH = "3f7b30f27e5ced0d95713d57210069db26973074c9220107a6d872e485faa90bf6a6afaff733dd8250807ffc687d8837021c809fb0b5e17148d3b48dfa721e15"
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
