SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.11.1"

RPM_NAME = "python39-geopandas-0.11.1-2.2.noarch.rpm"
RPM_HASH = "0aab4dcbc8f4bbeaaa77f4a35c60676937909ee94c29f5fab56470fb30f2a75cbe5848cfcc90fe1f5d8a0b3b957e2530ad16428613462d99993000c2d3c86995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geopandas \
python39-geopandas \
python3dist-geopandas"

RDEPENDS:${PN} += "python-abi \
python39-Fiona \
python39-pandas \
python39-pyproj \
python39-shapely"

inherit rpm
