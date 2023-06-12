SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi3-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi3-hpc provides the dependency to get binary package boost_1_82_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi3-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi3-hpc-1.82.0-1.1.noarch.rpm"
RPM_HASH = "bdd3e2ef1ab82adab495227b4e712a206b7fc75f6605f86c14c0ecadd1c0a2b5651fb5fed81015158fe7e4c234b60a66e0317402966c63d5b5be026b4e6220fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi3-hpc"
RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi3-hpc"

inherit rpm
