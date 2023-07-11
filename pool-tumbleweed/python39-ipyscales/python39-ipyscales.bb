SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-ipyscales-0.7.0-5.5.noarch.rpm"
RPM_HASH = "a7e7bc2c4e5e7d1ff016e619dfff081687b9e96bc5ceb43eb0f109d4a16ce5cb739b967d0ec9d3770dcd168319df10f9c7e92f0c2ba721b07cbab3afcef6120f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyscales \
python39-ipyscales \
python39-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python39-ipywidgets \
python39-numpy"

inherit rpm
