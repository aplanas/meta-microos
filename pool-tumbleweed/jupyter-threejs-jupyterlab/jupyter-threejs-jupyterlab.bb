SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-threejs-jupyterlab-2.4.0-7.9.noarch.rpm"
RPM_HASH = "5d3a0aef992f33292cf3c424d6b536a01391b93227e26bd9bd59c4315246fbd34b1e5ade0843b9294bfe81c214015e123c923b178e0df8ebffdb4af69a1c81fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-pythreejs-jupyterlab \
jupyter-threejs-jupyterlab"

RDEPENDS:${PN} += "jupyter-ipydatawidgets-jupyterlab \
jupyter-jupyterlab \
python3-pythreejs"

inherit rpm
