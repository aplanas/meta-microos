SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.13.2"

RPM_NAME = "python311-geopandas-0.13.2-1.1.noarch.rpm"
RPM_HASH = "6ea0c4030e43d405e196fe364464472acedd8ed9902226b594234c34beac0628cf059eecbdd86a9fb3e9f7ef6ab4cb9f7a1540ead85cafdfe03e8a88d14fa917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geopandas \
python3.11dist-geopandas \
python311-geopandas \
python3dist-geopandas"

RDEPENDS:${PN} += "proj \
python-abi \
python311-Fiona \
python311-packaging \
python311-pandas \
python311-pyproj \
python311-shapely"

inherit rpm
