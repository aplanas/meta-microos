SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "python39-Shapely-1.8.4-1.7.aarch64.rpm"
RPM_HASH = "be0b7540bab9cda718a3b0f8db82786038681986b7f55a1fab3fdb59d29075d0104d95dcec541f327f5cce4b53ed39f0176ba60fe9752206b5ded7abbdc5afb7"

RPROVIDES:${PN} += "python3.9dist(shapely) \
python39-Shapely \
python39-Shapely(aarch-64) \
python39-shapely \
python3dist(shapely)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgeos3_11_2 \
libgeos_c.so.1()(64bit) \
libgeos_c1 \
python(abi)"

inherit rpm
