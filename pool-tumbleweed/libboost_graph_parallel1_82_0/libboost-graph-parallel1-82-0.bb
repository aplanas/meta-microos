SUMMARY = "Boost.Graph.Distributed runtime library"
DESCRIPTION = "This package contains the Boost.Graph parallel runtime library"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph_parallel1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "3e9deff6e799b9b548f1f68d0cc4ea77a1f94a9224abd3ed1997ad8673aebf0d33ecdf5a6b85611138fbf9a38c09b55bb6050c517556d90f508ce03b341ef7ec"

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
