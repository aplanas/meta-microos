SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.0.6"

RPM_NAME = "python311-ipywidgets-8.0.6-1.3.noarch.rpm"
RPM_HASH = "5dbc113421a4af2739980a108acde8ce7d5e2c686b9d70a50f9d8c28c238c8839bf67d05eb280bd55f1e59d4ee1861225c90f3e0220f039b6d7e5e776492a430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipywidgets \
python3-ipywidgets \
python3-jupyter-ipywidgets \
python3.11dist-ipywidgets \
python311-ipywidgets \
python311-jupyter-ipywidgets \
python3dist-ipywidgets"

RDEPENDS:${PN} += "-python311-jupyterlab-widgets >= 3.0.7 with python311-jupyterlab-widgets < 4 \
-python311-widgetsnbextension >= 4.0.7 with python311-widgetsnbextension < 5 \
python-abi \
python311-ipykernel \
python311-ipython \
python311-traitlets"

inherit rpm
