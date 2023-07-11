SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "python39-jupyterlab-widgets-3.0.7-1.3.noarch.rpm"
RPM_HASH = "b87c715afa28559040422ae364833ef3a703f4b50c71f1de81d78512d933e54c4b823362708478db9fcbddb9bfc686c58c67263886598238c45ad9abc7e525c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab-widgets \
python39-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
