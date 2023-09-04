SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.8"

RPM_NAME = "python39-jupyterlab-widgets-3.0.8-1.1.noarch.rpm"
RPM_HASH = "1ea0d9ef42a04320b893573816ab76f465a1cccdb7b46130f5807dbb6182973c69cdd6dedef729e0b91136d01c5145730e2d3f217207af0ce535a3e919226221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab-widgets \
python39-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
