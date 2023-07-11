SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.0.6"

RPM_NAME = "python39-ipywidgets-8.0.6-1.3.noarch.rpm"
RPM_HASH = "223f04f59869db24970a914cd12418493b73276789abac825dae66aced2a3a411723587658f8977c172b7b609dd7d5f19542febc2e9bdf9291cbbdab683f6a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipywidgets \
python39-ipywidgets \
python39-jupyter-ipywidgets \
python3dist-ipywidgets"

RDEPENDS:${PN} += "-python39-jupyterlab-widgets >= 3.0.7 with python39-jupyterlab-widgets < 4 \
-python39-widgetsnbextension >= 4.0.7 with python39-widgetsnbextension < 5 \
python-abi \
python39-ipykernel \
python39-ipython \
python39-traitlets"

inherit rpm
