SUMMARY = "Development headers for Boost.MPI library"
DESCRIPTION = "Development headers for Boost.MPI boost library"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "e5cc122b5d86df29c75af095cc8db87981a080e5e8150db5aa00b5a6de56560f5aeb8badea650e95754dbea3b5dda2d391b667891be85e943f419ce90b078d57"

RPROVIDES:${PN} += "libboost_mpi-devel-impl \
libboost_mpi1_82_0-devel \
libboost_mpi1_82_0-devel(aarch-64)"

RDEPENDS:${PN} += "libboost_graph1_82_0-devel \
libboost_headers1_82_0-devel \
libboost_mpi1_82_0 \
libboost_python-py3-1_82_0-devel \
libboost_serialization1_82_0-devel \
openmpi4-devel"

inherit rpm
