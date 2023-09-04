SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python39-ipyleaflet-0.17.3-3.1.noarch.rpm"
RPM_HASH = "1aeed45dd956d93ead809bbd254900ba6ee817d44454e1a381d038516495883d81ee94cf2d04de25cd83075d7dfe8e640a4babcbfdc19279308a89b34fa35070"
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
