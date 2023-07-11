SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi4-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi4-hpc provides the dependency to get binary package boost_1_82_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi4-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi4-hpc-1.82.0-1.2.noarch.rpm"
RPM_HASH = "1ddde33b318cb7d82ec1dff25a32ba39554a365527e7d308e0cdb84ea02ae0028b913ba6789ea804e78d7149ea1c5df6e29855063b0d0bc9ef6f8565a0e6a338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi4-hpc"

inherit rpm
