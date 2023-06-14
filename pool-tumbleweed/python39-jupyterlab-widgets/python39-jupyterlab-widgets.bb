SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "python39-jupyterlab-widgets-3.0.7-1.1.noarch.rpm"
RPM_HASH = "9c7a14987bd930c9b94a357c9eb158cb1f2eb8d18afd6c59a8a5b952c80530d17dbfaddefbf2585921dbf6ea5fa51bae99f8f3942144e9d90551fa0e8789e3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab-widgets \
python39-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
