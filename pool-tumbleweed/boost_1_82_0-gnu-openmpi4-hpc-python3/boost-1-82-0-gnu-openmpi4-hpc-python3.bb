SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi4-hpc-python3-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "4d3dc5f0ef799b2d48ea10b5e844657850da09125d727b0a1b1436c176a75410288507ad5ce64e4cb9dceecc6f0b3f90da2518fd9524b50570986df2b9cd8564"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi4-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi4-hpc"

inherit rpm
