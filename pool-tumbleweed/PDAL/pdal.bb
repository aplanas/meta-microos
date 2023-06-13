SUMMARY = "Point Data Abstraction Library (GDAL for point cloud data)"
DESCRIPTION = "PDAL is a C++ BSD library for translating and manipulating point cloud data. \
It is very much like the GDAL library which handles raster and vector data. \
 \
In addition to the library code, PDAL provides a suite of command-line \
applications that users can conveniently use to process, filter, translate, \
and query point cloud data. See Applications for more information. \
 \
This package provides tools & utilities using PDAL library libpdal"
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "PDAL-2.3.0-2.15.aarch64.rpm"
RPM_HASH = "c09cd9bf59fcf3af85b2aa731e2da975726b60353154a3df60a1ccc86d0759684790cfea2100cd2c1306b6fe3e69f80d0900681fa6157cda18fa1753da5792af"

RPROVIDES:${PN} += "PDAL \
PDAL(aarch-64) \
bundled(PoissonRecon) \
bundled(arbiter) \
bundled(nanoflann) \
bundled(nlohmann) \
pdal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libPDAL13 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpdal_base.so.13()(64bit) \
libpdal_util.so.13()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
