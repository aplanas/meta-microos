SUMMARY = "Development library for Boost.MPI Python 3.x serialization"
DESCRIPTION = "This package contains the Boost.MPI development library for Python 3.x \
serialization interface"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi_python-py3-1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "dc5736fd5dffd5f0c8c4a011ae0da4a4fc4231c776cec4adfca33e4db6f5886a005d6f1379824daa7cbb7b37f2b0da581e9b6c97ba8047034575337a382099c9"

RPROVIDES:${PN} += "libboost-mpi-python-py3-1-82-0-devel \
libboost-mpi-python3-devel-impl"

RDEPENDS:${PN} += "libboost-mpi-python-py3-1-82-0 \
libboost-mpi1-82-0-devel \
libboost-python-py3-1-82-0"

inherit rpm
