SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi_python-py3-1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "2630c7de52c86f77c78c78092752386fd3dce9fc6d8c180fa076089187d2590d2d0d5bf504b1265a406c17c89e251c853970cf987ad46aafd65b115608c6cb64"

RPROVIDES:${PN} += "libboost-mpi-python-py3-1-82-0 \
libboost-mpi-python-py3.so.1.82.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
