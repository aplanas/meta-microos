SUMMARY = "GDAL/OGR - a translator library for raster and vector geospatial data formats"
DESCRIPTION = "GDAL is a translator library for raster geospatial data formats that \
is released under an Open Source license. As a library, it presents a \
single abstract data model to the calling application for all \
supported formats. The related OGR library (which lives within the \
GDAL source tree) provides a similar capability for simple features \
vector data."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-3.6.3-2.4.aarch64.rpm"
RPM_HASH = "e01690d0c22631db56874fae1c2d78136f9b46281399e6467876c754c20dd61d997e678cd16f8fdb8973e752974999330fe982403771614d0199280fa28e7b3d"

RPROVIDES:${PN} += "gdal"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
python3-GDAL"

inherit rpm
