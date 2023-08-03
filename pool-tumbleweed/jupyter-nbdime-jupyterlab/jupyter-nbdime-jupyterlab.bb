SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-nbdime-jupyterlab-2.2.0-14.1.noarch.rpm"
RPM_HASH = "6435c6ac301ce662f1c5cc1d1cb50ac5419c78a08c96559fe877d711b523ed973c366a65c71da92ec3fc17329e7db996b1563651eab2a5219f4e5780ea50213d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-nbdime"

inherit rpm
