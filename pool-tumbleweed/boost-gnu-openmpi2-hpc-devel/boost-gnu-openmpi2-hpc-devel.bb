SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi2-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi2-hpc-devel-1.82.0-1.2.noarch.rpm"
RPM_HASH = "1e46571fb1058738261686b3f03d2ac8bde5fa12762bae01272ff27733ffccba0a7f183eb895b97d0ab400ed6c38d7eef46fb01e16009f6bffe520486de4f1f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc-devel"

inherit rpm
