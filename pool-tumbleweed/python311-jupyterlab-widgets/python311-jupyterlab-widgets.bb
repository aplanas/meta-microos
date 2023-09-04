SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.8"

RPM_NAME = "python311-jupyterlab-widgets-3.0.8-1.1.noarch.rpm"
RPM_HASH = "9d6319d446b65ae4274449de745577f438742790cd8e175dbdd39692910da6d8c71cd79126a94db32f9bae7a3acb82ebae2f1251bfa2837107c141202ce41de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-widgets \
python3.11dist-jupyterlab-widgets \
python311-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
