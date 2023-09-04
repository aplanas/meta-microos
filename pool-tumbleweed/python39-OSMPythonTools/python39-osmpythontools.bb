SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python39-OSMPythonTools-0.3.5-2.4.noarch.rpm"
RPM_HASH = "69c7a1a58ee948e4a926d12b3e3b6b1316945bb0de077f888ce1ef7f7d0a2c5357261b74c3f847cdd941ea7cd8c85378280cfa623d89ce142e594a26b05446a8"
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
