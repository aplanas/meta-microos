SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi4-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi4-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi4-hpc-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "35455544b630a44d038fbc604f10d4ceb0ea9ff7aa41cd9e94a31a8fcd2dbc248bee6952b42f378002163797550a50bbe6ccca728c42efe42d347afd7efc9d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi4-hpc-devel"
RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi4-hpc-devel"

inherit rpm
