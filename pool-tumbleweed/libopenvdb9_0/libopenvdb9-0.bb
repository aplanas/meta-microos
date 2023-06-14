SUMMARY = "Sparse volume data structure library"
DESCRIPTION = "OpenVDB is a C++ library comprising a hierarchical data structure and \
a large suite of tools for the efficient storage and manipulation of \
sparse volumetric data discretized on three-dimensional grids."
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "libopenvdb9_0-9.0.0-3.5.aarch64.rpm"
RPM_HASH = "617a7c3c48b116827a11635810c42288ca88ce5b5cd57d2f81eb05c9a3166ab9e106cf2db0b8fec7e2bad09be662db6fccd8b4a91fef738722cccd29b32ed96e"

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
