SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python311-ipyleaflet-0.17.3-1.2.noarch.rpm"
RPM_HASH = "fd15050960735a9ab90255dfbd529bc822746b9d5067a6844f862df3c1778b571ea7e2a3b080038e06085180321441f81e36045b8dc223f8b3496206fdc9aab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyleaflet \
python3.11dist-ipyleaflet \
python311-ipyleaflet \
python3dist-ipyleaflet"

RDEPENDS:${PN} += "-python311-ipywidgets >= 7.6.0 with python311-ipywidgets < 9 \
-python311-traittypes >= 0.2.1 with python311-traittypes < 3 \
jupyter-ipyleaflet \
python-abi \
python311-branca \
python311-xyzservices"

inherit rpm
