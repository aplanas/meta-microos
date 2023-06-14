SUMMARY = "Python 3.x bindings for Boost.Parallel.MPI library"
DESCRIPTION = "This package contains the Boost.Parallel.MPI bindings for Python 3.x"
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "python3-boost_parallel_mpi1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "c8e1595b23c28858ba547653dee8fab37fbde705ae2788840e506851a086c2405f27d006cc8d5aef35800079b70da1df33763e051bea4cd60dee68ab56afeac2"

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
