SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.13.2"

RPM_NAME = "python39-geopandas-0.13.2-1.2.noarch.rpm"
RPM_HASH = "fc9011cc2e2a462b26dd7736efeb7ae01a246e79e2f84d3f04dd6db794e7934c29f364efa82f0cb1f78b092021471b4127b772d269899d3b5cc38b8bb27d9115"
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
