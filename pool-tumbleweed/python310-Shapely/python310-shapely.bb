SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "python310-Shapely-1.8.4-1.9.aarch64.rpm"
RPM_HASH = "c72e8ea54696887e71f99b522a7f4748d07722bbb992c5bfa20d6e98cc01d41cd9d2da926688615e8e1af0a1473a2f9012ee431ff1ddda982c4dfb36ff56f57a"

RPROVIDES:${PN} += "python3.10dist-shapely \
python310-Shapely \
python310-shapely \
python3dist-shapely"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
libgeos-c1 \
libgeos3-11-2 \
python-abi"

inherit rpm
