SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python310-ipyleaflet-0.17.3-3.1.noarch.rpm"
RPM_HASH = "c32353edbfd4b6536a6026a244e5c3db1fd925d627cbe4b9a351357cd9acff716e35b326ed8f291ea87d2c91f4d90efa9aee1af0f99d49a38bd16c10ac4d5254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyleaflet \
python310-ipyleaflet \
python3dist-ipyleaflet"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9 \
-python310-traittypes >= 0.2.1 with python310-traittypes < 3 \
jupyter-ipyleaflet \
python-abi \
python310-branca \
python310-xyzservices"

inherit rpm
