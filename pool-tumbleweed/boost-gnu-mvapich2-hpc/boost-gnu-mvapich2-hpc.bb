SUMMARY = "Dependency package for boost_1_82_0-gnu-mvapich2-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mvapich2-hpc provides the dependency to get binary package boost_1_82_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mvapich2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mvapich2-hpc-1.82.0-1.2.noarch.rpm"
RPM_HASH = "8ac85500522898b6ef4af03ef7fb133523eb1363181bb1e32df538344f5c1c924ded9eaa9fd70e4cc2c4fe284364805526c317066d9e0eed0f157996e837e076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc"

inherit rpm
