SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-threejs-2.4.0-9.1.noarch.rpm"
RPM_HASH = "9fc91e4ef62f414e64db13df3ab926451b82ee6829e171cb299d352d3c5924d045bee206691f79d59c00220c2a4d3e5dc17eb41f4c088af08c98f26e19948885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-pythreejs \
jupyter-threejs"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
jupyter-ipywidgets \
python3dist-pythreejs"

inherit rpm
