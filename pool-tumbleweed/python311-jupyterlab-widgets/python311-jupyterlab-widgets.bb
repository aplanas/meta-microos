SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "python311-jupyterlab-widgets-3.0.7-1.1.noarch.rpm"
RPM_HASH = "2dedc2865c19052d46a36bd0218a494c543a1482fcdb94c40b2ac24c9a3722168b0c4c4c7b2eb2f6fc1a1c5d9fb0579ef93db16584dcfbbe9a0320cbb4d31fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyterlab-widgets) \
python311-jupyterlab-widgets \
python311-jupyterlab_widgets \
python3dist(jupyterlab-widgets)"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python(abi)"

inherit rpm
