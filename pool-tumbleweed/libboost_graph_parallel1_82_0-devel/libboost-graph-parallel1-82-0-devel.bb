SUMMARY = "Development headers for Boost.Graph parallel library"
DESCRIPTION = "Development headers for Boost.Graph parallel boost library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph_parallel1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "d0448f8a14338f18e6d9fc5d4203fbd2f3321a940f44c33e7ef67703c8b4dd9f8e54286e50a7ce3df970f216cc5f603e99163eb567865428381357b935d570f7"

RPROVIDES:${PN} += "libboost-graph-parallel-devel-impl \
libboost-graph-parallel1-82-0-devel"

RDEPENDS:${PN} += "libboost-graph-parallel1-82-0 \
libboost-headers1-82-0-devel \
libboost-mpi1-82-0-devel"

inherit rpm
