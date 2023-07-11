SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi2-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi2-hpc provides the dependency to get binary package boost_1_82_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi2-hpc-1.82.0-1.2.noarch.rpm"
RPM_HASH = "2445f749f2d9acfb570741fcc879ab625cee99b51e903a3574fd8d82c0b8772ba28cf550c20ddf2e44235e9a1498d83cc4335fbdb88b6e0819f363363f4e05bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc"

inherit rpm
