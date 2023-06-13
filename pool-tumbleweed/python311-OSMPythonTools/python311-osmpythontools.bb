SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.5"

RPM_NAME = "python311-OSMPythonTools-0.3.5-2.1.noarch.rpm"
RPM_HASH = "121119af135d55ab28597c67c01cf0877747eb71dbb4cbcd0ced2786ad47dedaa32b3744f6ce257bb8bae4d3f95a4bbc9cced838dbf145f01304280df58519e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(osmpythontools) \
python311-OSMPythonTools \
python3dist(osmpythontools)"

RDEPENDS:${PN} += "python(abi) \
python311-beautifulsoup4 \
python311-geojson \
python311-lxml \
python311-numpy \
python311-pandas \
python311-ujson \
python311-xarray"

inherit rpm
