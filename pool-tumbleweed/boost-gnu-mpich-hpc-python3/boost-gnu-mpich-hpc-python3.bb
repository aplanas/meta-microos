SUMMARY = "Dependency package for boost_1_82_0-gnu-mpich-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mpich-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-mpich-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mpich-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mpich-hpc-python3-1.82.0-1.1.noarch.rpm"
RPM_HASH = "beea75c496b6bc48c5de14c6fcd1b5d925f6f5d5a87d6044eca0ed23db4b76923c4cce998ff637444dde6c4728c38b87077fa9ed13f5072dc894848602fec3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mpich-hpc-python3"

RDEPENDS:${PN} += "boost_1_82_0-gnu-mpich-hpc-python3"

inherit rpm
