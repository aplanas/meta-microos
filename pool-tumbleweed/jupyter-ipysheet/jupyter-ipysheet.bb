SUMMARY = "Spreadsheet widget for the Jupyter notebook - Jupyterfiles"
DESCRIPTION = "A Jupyter widget providing spreadsheets for the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "jupyter-ipysheet-0.7.0-3.1.noarch.rpm"
RPM_HASH = "944211d5b7feec0d0636619fe6b31c6fc5b23b9deb695b36430f38d9c14af8a44adac2a00b506846231606aee4f4128fa616727fad442e7f75a1b94ed0af05dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipysheet"

RDEPENDS:${PN} += "-jupyter-ipywidgets >= 7.5.0 with jupyter-ipywidgets < 9 \
python3dist-ipysheet"

inherit rpm
