SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python311-OSMPythonTools-0.3.5-2.3.noarch.rpm"
RPM_HASH = "7e8da17b2d8bf127c2717dccd04217ee25fdef947627733ddb204b0c0e4003eed6e1e3a55b345b9c535872ec143f42bfe3f2364c0b44e7c993ed454afd1b2612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-OSMPythonTools \
python3.11dist-osmpythontools \
python311-OSMPythonTools \
python3dist-osmpythontools"

RDEPENDS:${PN} += "python-abi \
python311-beautifulsoup4 \
python311-geojson \
python311-lxml \
python311-numpy \
python311-pandas \
python311-ujson \
python311-xarray"

inherit rpm
