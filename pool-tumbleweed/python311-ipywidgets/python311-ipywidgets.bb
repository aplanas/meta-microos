SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.1.0"

RPM_NAME = "python311-ipywidgets-8.1.0-1.1.noarch.rpm"
RPM_HASH = "a43bbff7d0f7cfa0ca9eefbf83c4fe22c54eb6f6686a4c3c94a63e505d40f1630b7bed0fd70744a2296a1be048d517a2637eea10189a2a225b40896039587fb5"
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
python311-comm \
python311-ipython \
python311-traitlets"

inherit rpm
