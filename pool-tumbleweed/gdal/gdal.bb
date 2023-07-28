SUMMARY = "GDAL/OGR - a translator library for raster and vector geospatial data formats"
DESCRIPTION = "GDAL is a translator library for raster geospatial data formats that \
is released under an Open Source license. As a library, it presents a \
single abstract data model to the calling application for all \
supported formats. The related OGR library (which lives within the \
GDAL source tree) provides a similar capability for simple features \
vector data."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "gdal-3.6.3-2.6.aarch64.rpm"
RPM_HASH = "d517c80b54e171111010c1913c4d62b43a70aeeed79683df5bd2f7e2548b44feae23337ef1847799355eb662cee19fd24122c899226c6d6305a5c80d94301a2f"

RPROVIDES:${PN} += "gdal"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
python3-GDAL"

inherit rpm
