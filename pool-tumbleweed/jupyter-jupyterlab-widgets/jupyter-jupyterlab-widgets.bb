SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets - Jupyter JS files"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets - Jupyterlab-manager JS files"
LICENSE = "BSD-3-Clause"

PV = "3.0.8"

RPM_NAME = "jupyter-jupyterlab-widgets-3.0.8-1.1.noarch.rpm"
RPM_HASH = "da43ad3a674bfc546e63b22491e2c446ab2acb0adfa2e3815b5820767652a449b9c96cb5dfb136f3dd7e10cbc31d2c768cac6e8081d9e89edf820d6c0109884c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-widgets-jupyterlab-manager \
jupyter-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-filesystem \
python3dist-jupyterlab-widgets"

inherit rpm
