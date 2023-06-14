SUMMARY = "Development library for Boost.MPI Python 3.x serialization"
DESCRIPTION = "This package contains the Boost.MPI development library for Python 3.x \
serialization interface"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi_python-py3-1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "a0cb2753ae8e601edd9a4a441698dea158c31a017fb7c57df1796269278d5af7c243a6549fdc116958a2ee060c8eabda411360beaf628cf10ad8c1be9da1ab5f"

RPROVIDES:${PN} += "libboost-mpi-python-py3-1-82-0-devel \
libboost-mpi-python3-devel-impl"

RDEPENDS:${PN} += "libboost-mpi-python-py3-1-82-0 \
libboost-mpi1-82-0-devel \
libboost-python-py3-1-82-0"

inherit rpm
