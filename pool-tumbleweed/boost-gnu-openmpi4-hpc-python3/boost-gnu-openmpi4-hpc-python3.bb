SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi4-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi4-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-openmpi4-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi4-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi4-hpc-python3-1.82.0-1.2.noarch.rpm"
RPM_HASH = "cb24f53968d9fc4f1332c99da62eb789f396458a0e1332660372cc93fdbd78711fabd206ac9296ea8ce534214651db912eb705fbf3f7f945c3a79ed7ddfec67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi4-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi4-hpc-python3"

inherit rpm
