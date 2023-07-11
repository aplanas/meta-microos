SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi3-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi3-hpc provides the dependency to get binary package boost_1_82_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi3-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi3-hpc-1.82.0-1.2.noarch.rpm"
RPM_HASH = "bb7c744af59fca68c3408bfb4ee3603b7100ef211b210426f3b4f39fa2c81363f5b130d1b105c7befbb9846fa873e80e7c64668a5de0843b297ba59196a272a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi3-hpc"

inherit rpm
