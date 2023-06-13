SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi4-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi4-hpc provides the dependency to get binary package boost_1_82_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi4-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi4-hpc-1.82.0-1.1.noarch.rpm"
RPM_HASH = "cde174f251a2250b672ffb22b07c108fd95f8e3a80d6800f0a21dd600cd36574e0332d550910a3d2aebf1d0b2fac672c56ef2fb107bc8ddffe8db66f4aa7739a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi4-hpc"

inherit rpm
