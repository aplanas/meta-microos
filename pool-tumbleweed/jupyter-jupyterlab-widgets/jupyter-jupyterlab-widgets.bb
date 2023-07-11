SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets - Jupyter JS files"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets - Jupyterlab-manager JS files"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "jupyter-jupyterlab-widgets-3.0.7-1.3.noarch.rpm"
RPM_HASH = "43e1d344d301e30d8f82692b56502152380d8d4503fd6f9473833bba48c386ffaea0eddc5bb43e18f7044fed0f60334feecd9eba435520b7e1c3ae8fd7e331c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-widgets-jupyterlab-manager \
jupyter-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-filesystem"

inherit rpm
