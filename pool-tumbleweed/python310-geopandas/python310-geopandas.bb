SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.13.2"

RPM_NAME = "python310-geopandas-0.13.2-1.1.noarch.rpm"
RPM_HASH = "9949b67f51be308cb6cb5e9926ec9fdf6039dca524eeaa1ee9ced87c45ba974a4ac6ccd1f81124fe36f1483d3030362f2894e404981117d80725311e43bb018e"
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
