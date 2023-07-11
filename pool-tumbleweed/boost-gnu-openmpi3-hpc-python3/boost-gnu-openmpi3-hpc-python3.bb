SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi3-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi3-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-openmpi3-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi3-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi3-hpc-python3-1.82.0-1.2.noarch.rpm"
RPM_HASH = "797b4f5ce8c5a923a9abc837def71f991d475c0b5ca33f3374d3478a10856722b74d2c70b81038ad8c886a3d93021e1c383734617be8321a85d2dc78ed906626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi3-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi3-hpc-python3"

inherit rpm
