SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "python310-Shapely-1.8.4-1.7.aarch64.rpm"
RPM_HASH = "0d31973b757ee4e9b8f01156cc4af5e4d6fb685fa4bb8e2f92425276466968137e179a0bcd234ceda86b27e3791b0f173bf4cb934e0e872f3dbdeff2bfea4166"

RPROVIDES:${PN} += "python3-Shapely \
python3-shapely \
python3.10dist(shapely) \
python310-Shapely \
python310-Shapely(aarch-64) \
python310-shapely \
python3dist(shapely)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgeos3_11_2 \
libgeos_c.so.1()(64bit) \
libgeos_c1 \
python(abi)"

inherit rpm
