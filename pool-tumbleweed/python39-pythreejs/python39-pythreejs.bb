SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python39-pythreejs-2.4.1-7.9.noarch.rpm"
RPM_HASH = "4c9df93431e171e1cb18ff6de20c1271af8475fd29c3deb806309b135b8ac46d4d13372e2b202c7d4cf81528c97590b7ddf2fc4b26cd18569196174494eb1e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pythreejs \
python39-pythreejs \
python3dist-pythreejs"

RDEPENDS:${PN} += "jupyter-threejs \
python-abi \
python39-ipydatawidgets \
python39-ipywidgets \
python39-numpy \
python39-traitlets"

inherit rpm
