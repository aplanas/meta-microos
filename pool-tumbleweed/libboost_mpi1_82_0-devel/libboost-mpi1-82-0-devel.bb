SUMMARY = "Development headers for Boost.MPI library"
DESCRIPTION = "Development headers for Boost.MPI boost library"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "a2f78cba749e010b7022119890b40a8f8d2e27c8f8ba370ed46e5ac3a582e7aa8e8c937d01a0fd62eb6b316a47a63e1e9ae90ed3b1e8adb80d63fe131acf3b44"

RPROVIDES:${PN} += "libboost-mpi-devel-impl \
libboost-mpi1-82-0-devel"

RDEPENDS:${PN} += "libboost-graph1-82-0-devel \
libboost-headers1-82-0-devel \
libboost-mpi1-82-0 \
libboost-python-py3-1-82-0-devel \
libboost-serialization1-82-0-devel \
openmpi4-devel"

inherit rpm
