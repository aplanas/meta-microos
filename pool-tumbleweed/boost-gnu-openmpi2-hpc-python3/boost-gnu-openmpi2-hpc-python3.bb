SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi2-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi2-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-openmpi2-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi2-hpc-python3-1.82.0-1.2.noarch.rpm"
RPM_HASH = "590204b412be256b0fb8f77ffc68130c73350eb4adad71feabd2b83050c5a55f2f11b2e4372412a358730d424f60d135ffcea55359cc2d7ac0a2f2755be61ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi2-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc-python3"

inherit rpm
