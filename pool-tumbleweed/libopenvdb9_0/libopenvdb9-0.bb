SUMMARY = "Sparse volume data structure library"
DESCRIPTION = "OpenVDB is a C++ library comprising a hierarchical data structure and \
a large suite of tools for the efficient storage and manipulation of \
sparse volumetric data discretized on three-dimensional grids."
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "libopenvdb9_0-9.0.0-3.6.aarch64.rpm"
RPM_HASH = "173dd07774b67c570cc96b85f31c06700710edfb21779871cfe2397f2c60dc3cf1631eb4705007cb93cf5b649cf5f206e42f84d9556f14bfd0fab561861833b4"

RPROVIDES:${PN} += "libopenvdb.so.9.0 \
libopenvdb9-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblosc.so.1 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1"

inherit rpm
