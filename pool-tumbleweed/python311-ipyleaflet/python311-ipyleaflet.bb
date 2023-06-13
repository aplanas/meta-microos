SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python311-ipyleaflet-0.17.2-1.5.noarch.rpm"
RPM_HASH = "3952eaa78f2d5b79cf341f49cad5b808bc41863e665d0604e057b58e6931c4898e047908f247c29e0c886fd54fe5a415188c0b48bf40f5f377eaa3d45f3fdc09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyleaflet) \
python311-ipyleaflet \
python3dist(ipyleaflet)"

RDEPENDS:${PN} += "(python311-ipywidgets >= 7.6.0 with python311-ipywidgets < 9) \
(python311-traittypes >= 0.2.1 with python311-traittypes < 3) \
jupyter-ipyleaflet \
python(abi) \
python311-branca \
python311-xyzservices"

inherit rpm
