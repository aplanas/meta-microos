SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake."
LICENSE = "BSD-3-Clause"

PV = "5.107.0"

RPM_NAME = "extra-cmake-modules-5.107.0-1.1.noarch.rpm"
RPM_HASH = "5f66ff202b48e6629deb94fc4ef46f791f9517b2524be1577d47e85aa8a685d8fcd84d7880a667558532ebfe76997fc31624a097899c3a6d40194538fe40cdda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules \
kf5umbrella"

RDEPENDS:${PN} += "/usr/bin/env \
cmake \
gcc-c++ \
kf5-filesystem"

inherit rpm
