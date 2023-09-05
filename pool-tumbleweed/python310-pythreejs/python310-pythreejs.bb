SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python310-pythreejs-2.4.1-9.1.noarch.rpm"
RPM_HASH = "f028933e7c4ca3e94a8d8c9f8638a60984a3e16f54852aeb66fc5de5e81a6e8251af9c0a46a599dd121fdf020fd1126eed2dd0904a2c44301e0daa71d1149782"
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
