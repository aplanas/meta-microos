SUMMARY = "A JupyterLab widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the Jupyterlab widget \
 \
After installation you must run: \
jupyter labextension install @jupyter-widgets/jupyterlab-manager"
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "jupyter-jupyterlab-ipyscales-3.3.0-6.1.noarch.rpm"
RPM_HASH = "85a4a5460557fa6fbac25e27ebc70f70844ad894ecccba482af59fb96d5c6b61ece795e9ac2797756379febedd555d67af32037cb059fa956e121b1286e26a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyscales"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipyscales"

inherit rpm
