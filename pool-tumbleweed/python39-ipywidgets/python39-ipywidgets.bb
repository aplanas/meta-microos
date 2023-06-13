SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.0.6"

RPM_NAME = "python39-ipywidgets-8.0.6-1.1.noarch.rpm"
RPM_HASH = "c42b822b7271e4abf2e3d3043139002f69c41fbe669f3d098628b51f8fd3b9a12cf50fa591811f039da9b42c8dca8ad430d275addfa803ca8023e7887137c2da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipywidgets) \
python39-ipywidgets \
python39-jupyter_ipywidgets \
python3dist(ipywidgets)"

RDEPENDS:${PN} += "(python39-jupyterlab_widgets >= 3.0.7 with python39-jupyterlab_widgets < 4) \
(python39-widgetsnbextension >= 4.0.7 with python39-widgetsnbextension < 5) \
python(abi) \
python39-ipykernel \
python39-ipython \
python39-traitlets"

inherit rpm
