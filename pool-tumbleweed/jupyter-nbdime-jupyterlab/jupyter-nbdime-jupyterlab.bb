SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-nbdime-jupyterlab-2.2.0-15.1.noarch.rpm"
RPM_HASH = "6e83f07833ced73faf528940902f37e989839b441f39c07b2f85518430303b116058ad6a9cbf949c582e530d9c5134c702f65b30bdcbcb9e142002bd63e47010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-nbdime"

inherit rpm
