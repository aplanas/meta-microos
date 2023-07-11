SUMMARY = "Dependency package for boost_1_82_0-gnu-mvapich2-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mvapich2-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-mvapich2-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mvapich2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mvapich2-hpc-python3-1.82.0-1.2.noarch.rpm"
RPM_HASH = "5bc05a7e0773f167a85553d0e1fec8335145ad9530cedab7079078b75ed3ae05ad2c2f52843e36e0d8ea918c369812da5fc18b25a1fdfc133a2cb575e7d9a663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mvapich2-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-python3"

inherit rpm
