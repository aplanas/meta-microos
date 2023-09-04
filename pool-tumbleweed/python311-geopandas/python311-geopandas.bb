SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.13.2"

RPM_NAME = "python311-geopandas-0.13.2-1.2.noarch.rpm"
RPM_HASH = "f29fa6d81412f5f0555420ee9f441df4c13354bd208c0bded8f461c1275e3d03c47133fd8cb4ebc2b08136808fa9ab548574ad9c5661c680e534bd923950df81"
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
