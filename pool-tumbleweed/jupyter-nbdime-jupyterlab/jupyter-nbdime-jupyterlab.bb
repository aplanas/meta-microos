SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-nbdime-jupyterlab-2.2.0-12.3.noarch.rpm"
RPM_HASH = "e720e5f6b4b33f822c65c11a7ce82b13f9180203e93647590c8d93dec8be4316a3e6887171c2811750b143a8c2bcf6666848f14757311aa447f5717e19a8b4a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-nbdime"

inherit rpm
