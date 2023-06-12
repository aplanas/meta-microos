SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-pyshp-2.1.0-1.14.noarch.rpm"
RPM_HASH = "26591ae4c37299eea7378398a0d91ff31783dfcd5bbf2061ac066831ed60b7c5c76ac462a47806389d4eccd69acaa8b03e5ea1b251e2b818852a978075678539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshp \
python3.10dist(pyshp) \
python310-pyshp \
python3dist(pyshp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
