SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake."
LICENSE = "BSD-3-Clause"

PV = "5.106.0"

RPM_NAME = "extra-cmake-modules-5.106.0-1.1.noarch.rpm"
RPM_HASH = "ae1e1b9a34e25d7fef4a420ea091b5b36cc761be555d41d3f5bb6da201d0fbc1bfc0ff25f19b08c207073889d2c8cbf9d4af879bcb5a75c4d2e7cb2f9568c6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules \
kf5umbrella"
RDEPENDS:${PN} += "/usr/bin/env \
cmake \
gcc-c++ \
kf5-filesystem"

inherit rpm
