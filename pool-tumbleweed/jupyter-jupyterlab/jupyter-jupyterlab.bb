SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "jupyter-jupyterlab-4.0.2-1.2.noarch.rpm"
RPM_HASH = "3a6c7b4d89fd7d34d6b0fe7edae44db183da6a06acd934af93f3ceafe6a7ed47b2604f7ca5bdc4032db6adab1f776ed3df4de58b4215ee988ba02d372e73714f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab \
jupyter-jupyterlab-discovery"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
jupyter-jupyterlab-filesystem \
nodejs \
npm \
python3dist-jupyterlab"

inherit rpm
