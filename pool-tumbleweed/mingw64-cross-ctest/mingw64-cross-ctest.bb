SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "mingw64-cross-ctest-1.1.2-1.1.noarch.rpm"
RPM_HASH = "04172901ce41bc0bc0235efffa12aead3b8d544b7b07973cbd7c4a7b0e878791922cd739bbe4b16f22563e70226b5d1c29928f20de64a2a5484aa7f67426d62a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-ctest"

RDEPENDS:${PN} += "mingw64-cross-cmake \
mingw64-cross-wine"

inherit rpm
