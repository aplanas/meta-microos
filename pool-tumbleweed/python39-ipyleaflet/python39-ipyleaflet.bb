SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python39-ipyleaflet-0.17.2-1.5.noarch.rpm"
RPM_HASH = "658156b83630a68ed1a4c4ffae68f2c1847a401faa873528c1b3157e03b9b762a869bc01ba316690844f2a9f7294e4b82f7a7297aa91167833c0bfbb1d222870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyleaflet) \
python39-ipyleaflet \
python3dist(ipyleaflet)"

RDEPENDS:${PN} += "(python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9) \
(python39-traittypes >= 0.2.1 with python39-traittypes < 3) \
jupyter-ipyleaflet \
python(abi) \
python39-branca \
python39-xyzservices"

inherit rpm
