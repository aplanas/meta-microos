SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "jupyter-ipyparallel-8.6.1-1.2.noarch.rpm"
RPM_HASH = "e726f2fd9e6fc0d540f30b9925c944572982f606939c40750a9ce7b412a1844e508c6d6a7c0017bb80af7aab36656662262ef8aa891e9417d08e971c1ef962e1"
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
