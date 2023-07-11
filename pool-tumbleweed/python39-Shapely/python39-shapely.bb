SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "python39-Shapely-1.8.4-1.9.aarch64.rpm"
RPM_HASH = "04311ec27d9d80c4b02aa0ff0e9ae563a8dd06bec81e1a1794ea00201ba7e5564283fedd942d78fbc2d7bf1783098ce4c10f716f688cdef6ed5286979f88c288"

RPROVIDES:${PN} += "python3.9dist-shapely \
python39-Shapely \
python39-shapely \
python3dist-shapely"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
libgeos-c1 \
libgeos3-11-2 \
python-abi"

inherit rpm
