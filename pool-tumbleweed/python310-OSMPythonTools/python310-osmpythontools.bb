SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python310-OSMPythonTools-0.3.5-2.1.noarch.rpm"
RPM_HASH = "b167c200651c26bdd0dcd11c42321d12e96012a3e7ba483fe2c15821a233a59f3e14713721dd405a7cd18c7b08cf07eea84559780d98cf2400fe7025bae30f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-OSMPythonTools \
python3.10dist(osmpythontools) \
python310-OSMPythonTools \
python3dist(osmpythontools)"

RDEPENDS:${PN} += "python(abi) \
python310-beautifulsoup4 \
python310-geojson \
python310-lxml \
python310-numpy \
python310-pandas \
python310-ujson \
python310-xarray"

inherit rpm
