SUMMARY = "Libraries SFCGAL applications"
DESCRIPTION = "This library  support ISO 19107:2013, OGC Simple Features Access 1.2 for 3D operations. \
It provides standard compliant geometry types and operations, that can \
be accessed from its C or C++ APIs. PostGIS uses the C API, to expose some \
SFCGAL's functions in spatial databases (cf. PostGIS manual). \
 \
Geometry coordinates have an exact rational number representation and can \
be either 2D or 3D. Among supported geometry types are : \
 \
 Points \
 LineStrings \
 Polygons \
 TriangulatedSurfaces \
 PolyhedralSurfaces \
 GeometryCollections \
 Solids \
 \
Supported operations include : \
 \
 WKT reading and writing with exact rational number representation for coordinates \
 Intersection operations and predicates \
 Convex hull computation \
 Tessellation \
 Extrusion \
 Area and distance computation \
 Minkovski sums \
 Contour offsets \
 Straight skeleton generations"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libSFCGAL1-1.4.1-4.5.aarch64.rpm"
RPM_HASH = "6b5fe0e243b1e3db89231b7502378f2a10145191201d0db83fecff4864cb5001d49f934f603613faf0db2c12978c838cf13954a871c98622b16dbcde10784a22"

RPROVIDES:${PN} += "libSFCGAL.so.1 \
libSFCGAL1 \
libsfcgal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
