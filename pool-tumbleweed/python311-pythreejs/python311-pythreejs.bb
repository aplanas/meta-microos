SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python311-pythreejs-2.4.1-9.1.noarch.rpm"
RPM_HASH = "bebe6d86fd866292e59ceadc7e188dfe5f2d648d928d22601cd9f4bbf09ef6ed4f79fb88247f1e073c9176f8ba6c948844d9e3099fdc74d92c7d0c85fbe3f4b4"
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
