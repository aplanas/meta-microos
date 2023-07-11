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

RPM_NAME = "PDAL-2.3.0-2.16.aarch64.rpm"
RPM_HASH = "4760124e8d297bd8b81cb72bac73880e9179a4f3a67f3656a69017c500971702c040227ce9071d5025dd27fe7484f59a22fcfaea29f2c0522dae11253a565e41"

RPROVIDES:${PN} += "PDAL \
bundled-PoissonRecon \
bundled-arbiter \
bundled-nanoflann \
bundled-nlohmann \
pdal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPDAL13 \
libc.so.6 \
libgcc-s.so.1 \
libpdal-base.so.13 \
libpdal-util.so.13 \
libstdc++.so.6"

inherit rpm
