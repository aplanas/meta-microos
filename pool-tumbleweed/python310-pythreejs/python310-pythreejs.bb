SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python310-pythreejs-2.4.1-7.9.noarch.rpm"
RPM_HASH = "7f0136e8fce8119ab7d3569ad8f5a4df95317138a0b0ad528e713e1a6687b5a6d27ad4a2380743fb1bf60004a48f17e487570a3f562eb91d5174ad6319ccfc47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pythreejs \
python310-pythreejs \
python3dist-pythreejs"

RDEPENDS:${PN} += "jupyter-threejs \
python-abi \
python310-ipydatawidgets \
python310-ipywidgets \
python310-numpy \
python310-traitlets"

inherit rpm
