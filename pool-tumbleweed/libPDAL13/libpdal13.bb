SUMMARY = "Point Data Abstraction Library (GDAL for point cloud data)"
DESCRIPTION = "PDAL is a C++ BSD library for translating and manipulating point cloud data. \
It is very much like the GDAL library which handles raster and vector data. \
 \
In addition to the library code, PDAL provides a suite of command-line \
applications that users can conveniently use to process, filter, translate, \
and query point cloud data. See Applications for more information. \
 \
PDAL should not be confused with PCL (Point Cloud Library). \
PCL is a library specifically designed to provide algorithmic analysis and \
modification of point clouds. PDAL provides a limited interface to the PCL's \
facilities, but does not in general attempt to duplicate its capabilites. \
PDAL is focused more on data access and translation than PCL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "libPDAL13-2.3.0-2.15.aarch64.rpm"
RPM_HASH = "1523ea7a8747504efdc54433fc221f745d3a441a4337db8be9711b4cf1b3a0b55de61b5e417d85a607be854023382482b0684f332b5205b614282def6bb87890"

RPROVIDES:${PN} += "libPDAL13 \
libpdal-base.so.13 \
libpdal-plugin-kernel-fauxplugin.so.13 \
libpdal-plugin-reader-pgpointcloud.so.13 \
libpdal-plugin-writer-pgpointcloud.so.13 \
libpdal-util.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libgdal.so.32 \
libgeotiff.so.5 \
liblaszip.so.8 \
liblzma.so.5 \
libm.so.6 \
libpq.so.5 \
libstdc++.so.6 \
libunwind.so.8 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
