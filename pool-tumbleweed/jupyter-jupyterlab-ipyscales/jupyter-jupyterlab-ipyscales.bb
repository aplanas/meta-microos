SUMMARY = "A JupyterLab widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the Jupyterlab widget \
 \
After installation you must run: \
jupyter labextension install @jupyter-widgets/jupyterlab-manager"
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "jupyter-jupyterlab-ipyscales-3.3.0-5.5.noarch.rpm"
RPM_HASH = "8b038248aab66f44981be0f68ba42c844b207405b0adee6bc2decc78a6e4dabc40f23cfa938ed66012d747c651d9acb8d5f9dedc42dcb06742c6a82a38dc0a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyscales"

RDEPENDS:${PN} += "jupyter-jupyterlab"

inherit rpm
