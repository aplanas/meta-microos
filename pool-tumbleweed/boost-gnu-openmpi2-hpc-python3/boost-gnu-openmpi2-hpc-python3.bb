SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi2-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi2-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-openmpi2-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi2-hpc-python3-1.82.0-1.1.noarch.rpm"
RPM_HASH = "d6c793282a9b5cb7c74f3d480953a182406716fd92be250ea044dbb8c781ec8dec04babd775e2805e51132c5322c0f42b94d87af5c2309b37cf2343a8a9bc6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi2-hpc-python3"
RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi2-hpc-python3"

inherit rpm
