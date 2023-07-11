SUMMARY = "Python 3.x bindings for Boost.Parallel.MPI library"
DESCRIPTION = "This package contains the Boost.Parallel.MPI bindings for Python 3.x"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "python3-boost_parallel_mpi1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "98415cda69110f3e05c492894f74e28c411d790f3dc19d2c804391a1068e0609b8e22e433bc2f29eba563a8ebbab18c5b908e004d0bebd41b21b35c443a95c5e"

RPROVIDES:${PN} += "python3-boost-parallel-mpi-impl \
python3-boost-parallel-mpi1-82-0"

RDEPENDS:${PN} += "libboost-mpi-python-py3.so.1.82.0 \
libboost-mpi.so.1.82.0 \
libboost-python-py3.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
python-abi"

inherit rpm
