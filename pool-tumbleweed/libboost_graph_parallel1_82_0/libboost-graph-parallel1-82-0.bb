SUMMARY = "Boost.Graph.Distributed runtime library"
DESCRIPTION = "This package contains the Boost.Graph parallel runtime library"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph_parallel1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "4acad77ea6c372e96d39ea1d97a403bdc26d82d4da39b94062910dd77aa4961bdc59462973fb1f2656b84201aade4685ba351a7b6bea74b651e2bcada9770d1f"

RPROVIDES:${PN} += "libboost_graph_parallel.so.1.82.0()(64bit) \
libboost_graph_parallel1_82_0 \
libboost_graph_parallel1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
libboost_mpi.so.1.82.0()(64bit) \
libboost_serialization.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
