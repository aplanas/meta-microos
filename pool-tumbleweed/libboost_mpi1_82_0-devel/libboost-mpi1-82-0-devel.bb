SUMMARY = "Development headers for Boost.MPI library"
DESCRIPTION = "Development headers for Boost.MPI boost library"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "e5cc122b5d86df29c75af095cc8db87981a080e5e8150db5aa00b5a6de56560f5aeb8badea650e95754dbea3b5dda2d391b667891be85e943f419ce90b078d57"

RPROVIDES:${PN} += "libboost-mpi-devel-impl \
libboost-mpi1-82-0-devel"

RDEPENDS:${PN} += "libboost-graph1-82-0-devel \
libboost-headers1-82-0-devel \
libboost-mpi1-82-0 \
libboost-python-py3-1-82-0-devel \
libboost-serialization1-82-0-devel \
openmpi4-devel"

inherit rpm
