SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi4-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi4-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-openmpi4-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi4-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi4-hpc-python3-1.82.0-1.1.noarch.rpm"
RPM_HASH = "bdff1e1eeae0a9b1e16e53af241689af8c33c2d10ffc97911ea133104ac3d10746064942930e01891b489cc392aac3ace66003497e417d52a58eb0cc39f866b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi4-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi4-hpc-python3"

inherit rpm
