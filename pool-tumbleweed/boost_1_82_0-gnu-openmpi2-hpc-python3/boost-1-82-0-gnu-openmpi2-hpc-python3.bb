SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi2-hpc-python3-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "15f13fef540eb97752840213c7d010a0cb2fb466cbf94c2f23cfe91391611cb90d6092090904603b70451f30b0167a1e69b51e239082ada463a84a125e47b662"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi2-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc"

inherit rpm
