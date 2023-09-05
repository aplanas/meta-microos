SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-threejs-jupyterlab-2.4.0-9.1.noarch.rpm"
RPM_HASH = "8d5a4ddd5faee67d61506aecffd2d7fb9ee78293e9d9a6e0da8888d6685c64dc09adfd25bc5d36dca53334d8c2f02153b6a54202eba7168909756692aa4d2f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-pythreejs-jupyterlab \
jupyter-threejs-jupyterlab"

RDEPENDS:${PN} += "jupyter-ipydatawidgets-jupyterlab \
jupyter-jupyterlab \
python3dist-pythreejs"

inherit rpm
