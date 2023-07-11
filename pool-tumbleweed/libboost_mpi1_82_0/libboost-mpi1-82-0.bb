SUMMARY = "Boost.MPI runtime library"
DESCRIPTION = "This package contains the Boost.MPI runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "5c22d5fdf708c9873fbeae207bdcd9f24ba21a8cb6ad1ec037425be8d019e1addd7e0ea9949a7d1677884704b5649b450e88edce4cbc730838432ec7a90965fa"

RPROVIDES:${PN} += "libboost-mpi.so.1.82.0 \
libboost-mpi1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
