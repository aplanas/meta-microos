SUMMARY = "Dependency package for boost_1_82_0-gnu-mpich-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mpich-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mpich-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mpich-hpc-devel-1.82.0-1.2.noarch.rpm"
RPM_HASH = "19b6ceedff6ee0faa37c11fd92db7c9c2c8907725a15ef4bc32a1be2c678d68a540e4c308c1856e021930ab038cb8368847a9ac3ee2a6469c237fba66b0cb45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mpich-hpc-devel"

inherit rpm
