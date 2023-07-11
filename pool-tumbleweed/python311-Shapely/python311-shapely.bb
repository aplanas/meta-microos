SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "python311-Shapely-1.8.4-1.9.aarch64.rpm"
RPM_HASH = "e14ab58b8bce9cbfa83a6369ed0ff1334bf8628775db79756ca801bc7d6a974984ef29cf82521be35ae41aa69df357931aae71e099a1826da82e2bbb7ea6209c"

RPROVIDES:${PN} += "python3-Shapely \
python3-shapely \
python3.11dist-shapely \
python311-Shapely \
python311-shapely \
python3dist-shapely"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
libgeos-c1 \
libgeos3-11-2 \
python-abi"

inherit rpm
