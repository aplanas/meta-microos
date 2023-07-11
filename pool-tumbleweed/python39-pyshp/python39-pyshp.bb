SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-pyshp-2.1.0-1.15.noarch.rpm"
RPM_HASH = "98abd687ef361c27ff520a4772d95e6dc551bbdd7227b34265acb7f9c427c58053050d8021e4b47ef96c916962e64fe43ca388f57d9a6f49c29b27e024a6df31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyshp \
python39-pyshp \
python3dist-pyshp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
