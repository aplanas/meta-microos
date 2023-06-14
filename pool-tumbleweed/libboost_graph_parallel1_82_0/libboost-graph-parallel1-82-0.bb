SUMMARY = "Boost.Graph.Distributed runtime library"
DESCRIPTION = "This package contains the Boost.Graph parallel runtime library"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph_parallel1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "4acad77ea6c372e96d39ea1d97a403bdc26d82d4da39b94062910dd77aa4961bdc59462973fb1f2656b84201aade4685ba351a7b6bea74b651e2bcada9770d1f"

RPROVIDES:${PN} += "libboost-graph-parallel.so.1.82.0 \
libboost-graph-parallel1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libboost-mpi.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
