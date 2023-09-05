SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python39-pythreejs-2.4.1-9.1.noarch.rpm"
RPM_HASH = "bc8feab9576399abd1ff50c6607c76766e2391908acc71ac55b3ccb371ded3415843f0045286a0d0eac9f4645ba78b81685f0417391612a752c886cc643214f0"
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
