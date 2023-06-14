SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-pyshp-2.1.0-1.14.noarch.rpm"
RPM_HASH = "0a45d4959905795f3d35819d9382da4459c188e2f6fe7f16baa21c28b3279dd11996316208d671d25ce9ad33af2f144b485540250e4621c11bb8aae84849f2af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyshp \
python39-pyshp \
python3dist-pyshp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
