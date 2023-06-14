SUMMARY = "Spreadsheet widget for the Jupyter notebook - Jupyterfiles"
DESCRIPTION = "A Jupyter widget providing spreadsheets for the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "jupyter-ipysheet-0.7.0-1.5.noarch.rpm"
RPM_HASH = "ad17bc55393a431ebe663e10f8a0453db7f33c298785ee9b4521f35b4f9df79b097cce5193b37dbaae9deb9c8bcf9e93350b699b30b9275e963209cfa920a115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipysheet"

RDEPENDS:${PN} += "-jupyter-ipywidgets >= 7.5.0 with jupyter-ipywidgets < 9 \
-jupyter-jupyterlab or jupyter-notebook \
python3-ipysheet"

inherit rpm
