SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-pyshp-2.1.0-1.15.noarch.rpm"
RPM_HASH = "f113af18f93651cc6ab3fbbbaa2c884a19534dabd54e3421cf6841ce9f57aa27cabd68e8af6b20ee7eb5ed11c6d2a72f8debb68c12f5ad9d638cb5cdf4414aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshp \
python3.11dist-pyshp \
python311-pyshp \
python3dist-pyshp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
