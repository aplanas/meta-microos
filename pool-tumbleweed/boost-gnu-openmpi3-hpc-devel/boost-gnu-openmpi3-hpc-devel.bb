SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi3-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi3-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi3-hpc-devel-1.82.0-1.2.noarch.rpm"
RPM_HASH = "1ef0e3221cae0e9fba68179a54342f952e6584def719c5b971427747e2d4fb9e6231b2a040c60b5f2a9660165171bd1eb4226ce459579da0e331acb951a0f719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi3-hpc-devel"

inherit rpm
