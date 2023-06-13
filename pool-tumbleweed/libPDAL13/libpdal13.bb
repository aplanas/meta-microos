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
libPDAL13(aarch-64) \
libpdal_base.so.13()(64bit) \
libpdal_plugin_kernel_fauxplugin.so.13()(64bit) \
libpdal_plugin_reader_pgpointcloud.so.13()(64bit) \
libpdal_plugin_writer_pgpointcloud.so.13()(64bit) \
libpdal_util.so.13()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgdal.so.32()(64bit) \
libgeotiff.so.5()(64bit) \
liblaszip.so.8()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libunwind.so.8()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
