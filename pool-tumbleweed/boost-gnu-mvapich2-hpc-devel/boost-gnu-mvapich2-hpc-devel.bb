SUMMARY = "Dependency package for boost_1_82_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mvapich2-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mvapich2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mvapich2-hpc-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "a1d795e827ed607195e8b64841f6c92644b7ea4f4c6e6f87b52a2f352890fed8a03642d7805e5dfc702a34bf89032e4a82b76c0f52618490af4fb60423712381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-devel"

inherit rpm
