SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake."
LICENSE = "BSD-3-Clause"

PV = "5.108.0"

RPM_NAME = "extra-cmake-modules-5.108.0-1.1.noarch.rpm"
RPM_HASH = "df92a8a21e7ecc2adc31906d6b28c9d123a053b5cc81baea51e243c43cf17591968c89fdb03b029d11b9178150dbd34d0c5b5ff76904cba65a9ac30e7b1e7308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules \
kf5umbrella"

RDEPENDS:${PN} += "/usr/bin/env \
cmake \
gcc-c++ \
kf5-filesystem"

inherit rpm
