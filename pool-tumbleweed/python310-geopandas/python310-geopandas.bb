SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.13.2"

RPM_NAME = "python310-geopandas-0.13.2-1.2.noarch.rpm"
RPM_HASH = "5899b760208b1c47865b75dc1f175b139c151cd51aff6cb76ce72dde31d6c2227fa720cff6b1db317c96c64f9f8e9da13b8d12c47860ab8647abf38208d325ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-geopandas \
python310-geopandas \
python3dist-geopandas"

RDEPENDS:${PN} += "proj \
python-abi \
python310-Fiona \
python310-packaging \
python310-pandas \
python310-pyproj \
python310-shapely"

inherit rpm
