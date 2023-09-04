SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake."
LICENSE = "BSD-3-Clause"

PV = "5.109.0"

RPM_NAME = "extra-cmake-modules-5.109.0-1.1.noarch.rpm"
RPM_HASH = "bd08fe18206182815ce32d81d346e855c1499930b5dfeaafdf607d1e819f4f3e653edfe5fd86e83508845e24ecfe056cac1a1b8ae3e6cc59f1887b58bc00ea97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules \
kf5umbrella"

RDEPENDS:${PN} += "/usr/bin/env \
cmake \
gcc-c++ \
kf5-filesystem"

inherit rpm
