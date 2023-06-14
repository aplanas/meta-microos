SUMMARY = "Dependency package for boost_1_82_0-gnu-mpich-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mpich-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mpich-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mpich-hpc-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "843f1a05dc818850c3170b2f97355ae0e63fe66a9a1f7ec323576693ff87689a97936d9dec1fa58913bca94c757bc01de5ff600de79a3a5779d7681b5732a844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mpich-hpc-devel"

inherit rpm
