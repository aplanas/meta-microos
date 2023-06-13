SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "python311-Shapely-1.8.4-1.7.aarch64.rpm"
RPM_HASH = "b7162133627015ed9adec18d79c0e39596985fd6b0d70e926508a84c826e7821a5d1424d67aada8263f9ed03b2e66509d14aaff1828bdf04479d975e27d301c7"

RPROVIDES:${PN} += "python3.11dist(shapely) \
python311-Shapely \
python311-Shapely(aarch-64) \
python311-shapely \
python3dist(shapely)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgeos3_11_2 \
libgeos_c.so.1()(64bit) \
libgeos_c1 \
python(abi)"

inherit rpm
