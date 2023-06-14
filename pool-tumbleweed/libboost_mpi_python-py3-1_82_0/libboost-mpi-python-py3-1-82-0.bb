SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi_python-py3-1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "4da1461c6627bc7d662c395174ff015cfff53049569ebf156b4d5be1b1b204b441d9157dca9a5077487aef6059d2d3a57b255fa3b59927c4f862f69bdfd734f7"

RPROVIDES:${PN} += "libboost-mpi-python-py3-1-82-0 \
libboost-mpi-python-py3.so.1.82.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
