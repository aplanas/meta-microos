SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "jupyter-jupyterlab-4.0.5-2.1.noarch.rpm"
RPM_HASH = "2aeea8484d0356e52c70f6dec8c9ea80221912ecb716d8121830944fd6821859e28f588c0856d6a94a0b4fce5f530eca498cf3fde82e4adad22953cc3c0d9003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab \
jupyter-jupyterlab-discovery"

RDEPENDS:${PN} += "jupyter-jupyterlab-filesystem \
nodejs \
npm \
python3dist-jupyterlab"

inherit rpm
