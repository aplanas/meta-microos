SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.13.2"

RPM_NAME = "python39-geopandas-0.13.2-1.1.noarch.rpm"
RPM_HASH = "ae57a7416fef018f94840e5858d3ef9d83494f221c8e6715d52f97541d8d5c3bfa00ae4da59dca79caea53dab1d0e7bc9ff0fffe4b761d9d498d87d133af7aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-geopandas \
python39-geopandas \
python3dist-geopandas"

RDEPENDS:${PN} += "proj \
python-abi \
python39-Fiona \
python39-packaging \
python39-pandas \
python39-pyproj \
python39-shapely"

inherit rpm
