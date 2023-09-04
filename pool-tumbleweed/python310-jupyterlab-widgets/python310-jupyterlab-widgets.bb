SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.8"

RPM_NAME = "python310-jupyterlab-widgets-3.0.8-1.1.noarch.rpm"
RPM_HASH = "14e37b7cb9d15541287bffe52158251cab8cf80b004629210a26629d29fce35d2b9ed134734eb4a75b222e6d362e81c1c288b98baa4e66933edf31063ed64290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab-widgets \
python310-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
