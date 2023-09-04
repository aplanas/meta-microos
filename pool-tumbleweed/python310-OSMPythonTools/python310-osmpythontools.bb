SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python310-OSMPythonTools-0.3.5-2.4.noarch.rpm"
RPM_HASH = "43094fa0e3b2e895f922b82bfeedc90b7fb1ffcc89719cd08253786b6a9e5526c14d6a04cdc4a71f5c0b8b10732d6563c3cbb97db969c2b610a52b1aae36088e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-osmpythontools \
python310-OSMPythonTools \
python3dist-osmpythontools"

RDEPENDS:${PN} += "python-abi \
python310-beautifulsoup4 \
python310-geojson \
python310-lxml \
python310-numpy \
python310-pandas \
python310-ujson \
python310-xarray"

inherit rpm
