SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python39-pythreejs-2.4.1-7.8.noarch.rpm"
RPM_HASH = "27641c901b4fac2baa888ff070b54f8927e14f89e263013eb6f0885f4384b93b8490e4f7150f06fecf2b9d225b183315d0b40d3f2ea1334cb0fd8cb2b1907e01"
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
