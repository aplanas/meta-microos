SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi4-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi4-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi4-hpc-devel-1.82.0-1.2.noarch.rpm"
RPM_HASH = "e35e17ea323771b1393545531d1214cc065382d31800c080c24794a99d046d4cf564503474b2974c63e2c098815c4637cd3d6f2396b437b51c8b72d6edce03f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi4-hpc-devel"

inherit rpm
