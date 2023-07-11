SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python39-OSMPythonTools-0.3.5-2.3.noarch.rpm"
RPM_HASH = "1f886ef47b23a3f832c3ecb84f69875d3b0bfa572cf1d5764398aa895e46841a225a87c9af039c928b64017113bb5a85494cd0dd2d486a1e1c96a6004fa8b48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-osmpythontools \
python39-OSMPythonTools \
python3dist-osmpythontools"

RDEPENDS:${PN} += "python-abi \
python39-beautifulsoup4 \
python39-geojson \
python39-lxml \
python39-numpy \
python39-pandas \
python39-ujson \
python39-xarray"

inherit rpm
