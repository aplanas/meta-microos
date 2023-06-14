SUMMARY = "Dependency package for boost_1_82_0-gnu-mvapich2-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mvapich2-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-mvapich2-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mvapich2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mvapich2-hpc-python3-1.82.0-1.1.noarch.rpm"
RPM_HASH = "99bad0c8f183a18616d99a1fafbcfb4a9a58c91b7557e1cddc2484ee1e1bd165516ab8251638f04d42bc9c0cb1b8bcef2fed4174fa1ad653b6aa0ff588339dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mvapich2-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-python3"

inherit rpm
