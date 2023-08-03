SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "mingw32-cross-ctest-1.1.4-1.1.noarch.rpm"
RPM_HASH = "6d654417d430c476a6dd0feeb3b80d280de06da8375c4f62233fee92e355eecd1e2e9b3f0866ae5de963b67affada99b54c84707aef17dc20f5bdd73b812f694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-ctest"

RDEPENDS:${PN} += "mingw32-cross-cmake \
mingw32-cross-wine"

inherit rpm
