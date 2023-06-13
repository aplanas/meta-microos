SUMMARY = "MathGL library with MPI support"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-mpi8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "795a0cd68befc1b39dcb36a2fbd1137b3d58f0a9107317940a54b868eafc4f9c604fce6c8cdf42e0d6e534c65b296e6625eee0500c3aa42e572acefe1c838b23"

RPROVIDES:${PN} += "libmgl-mpi.so.8()(64bit) \
libmgl-mpi8 \
libmgl-mpi8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libmgl.so.8()(64bit) \
libmpi.so.12()(64bit) \
libmpi_cxx.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
