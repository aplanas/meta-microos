SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python39-OSMPythonTools-0.3.5-2.1.noarch.rpm"
RPM_HASH = "d576d8ce9b56d8ac9442dba077c1846b96b77c3e994456ee2471cba61c7e72f380fdd9aab58122fe0303ab4c9a65836cd29bbd7ac03ae232526cddc6ec67605d"
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
