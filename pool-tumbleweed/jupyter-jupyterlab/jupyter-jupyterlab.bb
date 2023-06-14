SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "3.6.3"

RPM_NAME = "jupyter-jupyterlab-3.6.3-1.1.noarch.rpm"
RPM_HASH = "4870e260c019a6b012c1109a9054414021670a9871cc116edc65d37f92472898ff3b08237153549b04f417ca132c4fbedebbb187057141bed1f1d2eb042e1b28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab \
jupyter-jupyterlab-discovery"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
jupyter-jupyterlab-filesystem \
nodejs \
npm \
python3dist-jupyterlab"

inherit rpm
