SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python310-OSMPythonTools-0.3.5-2.3.noarch.rpm"
RPM_HASH = "e6787234131f46a9c5512ff82fe069bd1f63b046a3c88ff5c973ec3a244b9d78217beaff582ffcccff3c8fd6d6df1d23aa45ebfc28063b15f3c89130f6afa355"
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
