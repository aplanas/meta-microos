SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python311-OSMPythonTools-0.3.5-2.4.noarch.rpm"
RPM_HASH = "43be6d5c9b41ed06922aea543a1e054d82a40db80baa09f0023f11aa47c79f2a8ef7ade273f93ad2c6bba22952005cbe4bc29fcaa9a6f8f099436c0b0740ead5"
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
