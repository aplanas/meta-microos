SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "python311-jupyterlab-widgets-3.0.7-1.3.noarch.rpm"
RPM_HASH = "fc75167fc47c55380cbcc007664adb7a9c5cfc08ebb96e6469667eb0f7d32b1c7c14e36a5fd3339bece305f557540f11c9435bea6c2d9690443dd874a13c327c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-widgets \
python3.11dist-jupyterlab-widgets \
python311-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
