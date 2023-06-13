SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.0.6"

RPM_NAME = "python311-ipywidgets-8.0.6-1.1.noarch.rpm"
RPM_HASH = "4452d79310fa2a3d37a45e88c03d9d611467cbfcf591e4411ce0b5ed80d76c0b2ce5664abb070050298ea8e50b5b77955127ea0cf99e05833ec0b1516d5e4d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipywidgets) \
python311-ipywidgets \
python311-jupyter_ipywidgets \
python3dist(ipywidgets)"

RDEPENDS:${PN} += "(python311-jupyterlab_widgets >= 3.0.7 with python311-jupyterlab_widgets < 4) \
(python311-widgetsnbextension >= 4.0.7 with python311-widgetsnbextension < 5) \
python(abi) \
python311-ipykernel \
python311-ipython \
python311-traitlets"

inherit rpm
