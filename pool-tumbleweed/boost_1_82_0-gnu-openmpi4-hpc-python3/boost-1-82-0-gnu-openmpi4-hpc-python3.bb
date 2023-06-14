SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi4-hpc-python3-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "7d454e203e79abbfccb2c53bb627924d241f45f27ff3e70365580d1dbbcc21402dcd3172ffa470dfe4c2b5aeee0e72f4d4aab3e4c63141930c3947bb6bc3aa72"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi4-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi4-hpc"

inherit rpm
