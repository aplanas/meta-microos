SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-nbdime-jupyterlab-2.2.0-13.1.noarch.rpm"
RPM_HASH = "13c23c47800f4b26222f5b6497faee8ad2ef7a4ddf07d763c28c2573f3910e13d208781f610bf65c2aeacb250e48b4e2f9f8f59446449a036cc487f3e6cd7c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-nbdime"

inherit rpm
