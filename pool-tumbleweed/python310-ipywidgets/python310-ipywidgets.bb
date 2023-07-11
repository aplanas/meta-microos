SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.0.6"

RPM_NAME = "python310-ipywidgets-8.0.6-1.3.noarch.rpm"
RPM_HASH = "93df825f4ba76c971e4c4df602046530d34a3131e8efa682edceecae4b1ca1b3714494c270cf132f8d0ffad21839892ce7a89acc422d0c8f20b9386f8354332c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipywidgets \
python310-ipywidgets \
python310-jupyter-ipywidgets \
python3dist-ipywidgets"

RDEPENDS:${PN} += "-python310-jupyterlab-widgets >= 3.0.7 with python310-jupyterlab-widgets < 4 \
-python310-widgetsnbextension >= 4.0.7 with python310-widgetsnbextension < 5 \
python-abi \
python310-ipykernel \
python310-ipython \
python310-traitlets"

inherit rpm
