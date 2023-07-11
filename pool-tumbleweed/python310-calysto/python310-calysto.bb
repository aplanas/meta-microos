SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python310-calysto-1.0.6-2.14.noarch.rpm"
RPM_HASH = "6197decd0005069ea3b9d7298355f88bfe33e155479e67c93d30c0de977e7aec905de9088103f72f0afc6afd80b20e5e7767bf3524ab95cf9a0316e5c7bd840c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-calysto \
python310-calysto \
python310-jupyter-calysto \
python3dist-calysto"

RDEPENDS:${PN} += "jupyter-calysto \
python-abi \
python310-CairoSVG \
python310-ipython \
python310-ipywidgets \
python310-metakernel \
python310-numpy \
python310-svgwrite"

inherit rpm
