SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mvapich2-hpc-python3-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "e12b3ccbe1679b72fcc328702eadd9093826e052e5c2ef6d376a1a151fbe23108b0a6f5f58ee3761feab17589f362ca23e2f8f820e67bcadac02d521ffdd55a0"

RPROVIDES:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc"

inherit rpm
