SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python311-ipyleaflet-0.17.3-3.1.noarch.rpm"
RPM_HASH = "e9658c886ed2f3bbfad461e80feec8069335fa32065fecb77cb77d325c8a8069d10230f5d2f01ad20d343d186f7c3f56798ede3f5873a74ca4db9306124368a9"
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
