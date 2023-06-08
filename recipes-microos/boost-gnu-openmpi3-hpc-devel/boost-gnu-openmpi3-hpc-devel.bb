SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi3-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi3-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi3-hpc-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "988525b33a61f701d1211eb088182f3abcf285c27ba1ab1329e36b976d017475c7c985fca0d3785c5d2082616ca01d1ef968219bc1d4f942f2fa86006046bea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi3-hpc-devel"
RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi3-hpc-devel"

inherit rpm
