SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "jupyter-ipyparallel-8.6.1-1.3.noarch.rpm"
RPM_HASH = "54fe0a3ed1fb4776c3829683f78c115fb67aa2a652acca5573eb22727c27ae0f2cb8bd5b1952e1deb9669ab9ec296ec8ce792c4e70d1b381c088de62d390414c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyparallel \
jupyter-ipyparallel-l \
jupyter-ipyparallel-nbext \
jupyter-ipyparallel-serverextension"

RDEPENDS:${PN} += "jupyter-jupyter-core \
jupyter-jupyter-server \
jupyter-jupyterlab \
jupyter-notebook \
python3-ipyparallel"

inherit rpm
