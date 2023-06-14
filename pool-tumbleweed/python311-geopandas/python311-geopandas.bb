SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.11.1"

RPM_NAME = "python311-geopandas-0.11.1-2.2.noarch.rpm"
RPM_HASH = "bcd0a5216a476b82ac51a90f5a4592654dbc7c904802a4038eaf38f3e7627fe583d86a292287b8fb308508d6a1d81d5f61acee4c8fd6402ec87868bbb566ac94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-geopandas \
python311-geopandas \
python3dist-geopandas"

RDEPENDS:${PN} += "python-abi \
python311-Fiona \
python311-pandas \
python311-pyproj \
python311-shapely"

inherit rpm
