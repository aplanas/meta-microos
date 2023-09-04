SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.1.0"

RPM_NAME = "python39-ipywidgets-8.1.0-1.1.noarch.rpm"
RPM_HASH = "1d20db77e39d46add717e212cd7900da7ef304912b90070046e38ee4d420df631a2250b8edd63a7f21a7641076391d3012c4d9d1da9209a23f587931374f8243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipywidgets \
python39-ipywidgets \
python39-jupyter-ipywidgets \
python3dist-ipywidgets"

RDEPENDS:${PN} += "-python39-jupyterlab-widgets >= 3.0.7 with python39-jupyterlab-widgets < 4 \
-python39-widgetsnbextension >= 4.0.7 with python39-widgetsnbextension < 5 \
python-abi \
python39-comm \
python39-ipython \
python39-traitlets"

inherit rpm
