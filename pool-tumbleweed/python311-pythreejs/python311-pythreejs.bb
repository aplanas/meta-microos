SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python311-pythreejs-2.4.1-7.9.noarch.rpm"
RPM_HASH = "a81533f2d7b883cc2abacc83cd03e3122f8517b76f684536305eca694897e2a9f0daf20342752ce2c7b8d428946167a28acb61a8e1f976f5fd0e6de13a565615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythreejs \
python3.11dist-pythreejs \
python311-pythreejs \
python3dist-pythreejs"

RDEPENDS:${PN} += "jupyter-threejs \
python-abi \
python311-ipydatawidgets \
python311-ipywidgets \
python311-numpy \
python311-traitlets"

inherit rpm
