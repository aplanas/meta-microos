SUMMARY = "A JupyterLab widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the Jupyterlab widget \
 \
After installation you must run: \
jupyter labextension install @jupyter-widgets/jupyterlab-manager"
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "jupyter-jupyterlab-ipyscales-3.3.0-5.4.noarch.rpm"
RPM_HASH = "6b32c845f4955501f52e444f77ad14ca74f1d3c55ba8c3b59bd73a7cbe7b7ec2aa3e3174ef2173f68b5cdba50444d2bd76fa667f633e3ee3e8acbf692ef7e1f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyscales"

RDEPENDS:${PN} += "jupyter-jupyterlab"

inherit rpm
