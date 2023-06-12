SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python310-pythreejs-2.4.1-7.8.noarch.rpm"
RPM_HASH = "292fc7e0bb92ac1209d0a659ea93f16fe8e5d7f2093a083d25336a525e5df374bca6f484cdc6a16cfea1d6e4f28b01d1d70dcc823f3c6cc1f44fc2d98107776d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythreejs \
python3.10dist(pythreejs) \
python310-pythreejs \
python3dist(pythreejs)"
RDEPENDS:${PN} += "jupyter-threejs \
python(abi) \
python310-ipydatawidgets \
python310-ipywidgets \
python310-numpy \
python310-traitlets"

inherit rpm
