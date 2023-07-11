SUMMARY = "Development headers for Boost.Graph parallel library"
DESCRIPTION = "Development headers for Boost.Graph parallel boost library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph_parallel1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "5a403bde1fe31078765ed78a19d02763d783a50ece712dcc47384864e2e8ace1274d6d3a5588122d1c8622028228b7eced41c2bef9d23bf2de9634c9cefaf4f2"

RPROVIDES:${PN} += "libboost-graph-parallel-devel-impl \
libboost-graph-parallel1-82-0-devel"

RDEPENDS:${PN} += "libboost-graph-parallel1-82-0 \
libboost-headers1-82-0-devel \
libboost-mpi1-82-0-devel"

inherit rpm
