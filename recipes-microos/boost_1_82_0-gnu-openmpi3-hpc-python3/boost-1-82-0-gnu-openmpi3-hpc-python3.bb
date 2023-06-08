SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi3-hpc-python3-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "8c1583102de70ddc9afb2f2178f2f1583f23b7321f966f424ed41c1b31ba5d933d2929ce0c768ca0265b9bc31930b7aefb4be48053a099b48c8ac5b366653f47"

RPROVIDES:${PN} += "boost_1_82_0-gnu-openmpi3-hpc-python3 boost_1_82_0-gnu-openmpi3-hpc-python3(aarch-64)"
RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi3-hpc"

inherit rpm
