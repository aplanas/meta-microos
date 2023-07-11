SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python39-ipyleaflet-0.17.3-1.2.noarch.rpm"
RPM_HASH = "727e2cf46d3fcfcb542cb0abdce9b3fe6222c1e3a6359c96c622cc4c5448ff1be6522a2542d5c0f21c664cea142e666af8e26cadf481cc8b6a33ab3814801eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyleaflet \
python39-ipyleaflet \
python3dist-ipyleaflet"

RDEPENDS:${PN} += "-python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9 \
-python39-traittypes >= 0.2.1 with python39-traittypes < 3 \
jupyter-ipyleaflet \
python-abi \
python39-branca \
python39-xyzservices"

inherit rpm
