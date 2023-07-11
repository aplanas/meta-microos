SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-threejs-2.4.0-7.9.noarch.rpm"
RPM_HASH = "f4d3b05a6382f79759b117ced1edda9beaaac5b311855b387040d78e1e72f6387e2175478db93d49004b3b99b76dd98f4d08fdb9e5c1d738e0d31da01508158e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-pythreejs \
jupyter-threejs"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
jupyter-ipywidgets \
jupyter-notebook \
python3-pythreejs"

inherit rpm
