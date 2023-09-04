SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.1.0"

RPM_NAME = "python310-ipywidgets-8.1.0-1.1.noarch.rpm"
RPM_HASH = "911edd3d18fe1467d99c6b74d673472d3b44d022bc8d3d4ffc79c92fcdf079e9bf3496f75cfe2f7d194d91b7afe3f2f16b77ae10a2676144f240217ab0127955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipywidgets \
python310-ipywidgets \
python310-jupyter-ipywidgets \
python3dist-ipywidgets"

RDEPENDS:${PN} += "-python310-jupyterlab-widgets >= 3.0.7 with python310-jupyterlab-widgets < 4 \
-python310-widgetsnbextension >= 4.0.7 with python310-widgetsnbextension < 5 \
python-abi \
python310-comm \
python310-ipython \
python310-traitlets"

inherit rpm
