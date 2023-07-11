SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python310-ipyleaflet-0.17.3-1.2.noarch.rpm"
RPM_HASH = "ae166f5aea8dfbf61202737f47b521f4d7c990170157170f793fd8b4b3696aa2654b79425169729e9190c315e4ad21d540feea93abb8a569542653644f6e45c1"
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
