SUMMARY = "IPython HTML widgets for Jupyter"
DESCRIPTION = "Interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"

PV = "8.0.6"

RPM_NAME = "python310-ipywidgets-8.0.6-1.1.noarch.rpm"
RPM_HASH = "5a6b5a93220bc84c74382a002a7856adb9b3adfadd447d290f2b51774d1ef4d40e93ed4a9da971e66efea013eb7e0a5c900ea39bb33c6b77a77851bf21bf107a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipywidgets \
python3-ipywidgets \
python3-jupyter_ipywidgets \
python3.10dist(ipywidgets) \
python310-ipywidgets \
python310-jupyter_ipywidgets \
python3dist(ipywidgets)"

RDEPENDS:${PN} += "(python310-jupyterlab_widgets >= 3.0.7 with python310-jupyterlab_widgets < 4) \
(python310-widgetsnbextension >= 4.0.7 with python310-widgetsnbextension < 5) \
python(abi) \
python310-ipykernel \
python310-ipython \
python310-traitlets"

inherit rpm
