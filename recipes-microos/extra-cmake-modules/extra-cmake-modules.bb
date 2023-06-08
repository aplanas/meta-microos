SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake."
LICENSE = "BSD-3-Clause"

PV = "5.105.0"

RPM_NAME = "extra-cmake-modules-5.105.0-1.1.noarch.rpm"
RPM_HASH = "bb1dc797c5891c2ad8d91d566f0e6d916d8d124efc8487f2125629e0b6066aeaaf66b0976164a6a26dae87f461c3f2def14fa8b36ed2e098fb1f7580946ed0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules kf5umbrella"
RDEPENDS:${PN} += "/usr/bin/env cmake gcc-c++ kf5-filesystem"

inherit rpm
