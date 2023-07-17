SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "mingw32-cross-ctest-1.1.3-1.1.noarch.rpm"
RPM_HASH = "ebbc0040025f753f3d71e2f5edd3ceba9a76a6495e76a2b242dab3f6d3f5cedd17ebc425e840308535526a5a1e0c33d4bb8bf3c95341c672c34f94b9248a6fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-ctest"

RDEPENDS:${PN} += "mingw32-cross-cmake \
mingw32-cross-wine"

inherit rpm
