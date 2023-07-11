SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-pyshp-2.1.0-1.15.noarch.rpm"
RPM_HASH = "5f9917ae8c92c9658d38723f23dd20f6cfb8d8b6e20f0c38faa8bfd0f2d8a988fc5a86c3a6f0ee490a5cd324bb4279213fc52141c047b3f121d0c0eea277ac96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyshp \
python310-pyshp \
python3dist-pyshp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
