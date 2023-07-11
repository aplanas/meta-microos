SUMMARY = "Spreadsheet widget for the Jupyter notebook - Jupyterfiles"
DESCRIPTION = "A Jupyter widget providing spreadsheets for the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "jupyter-ipysheet-0.7.0-2.1.noarch.rpm"
RPM_HASH = "bbedd69bf54440b7a6298c8d52657ab660c7cbf8b9a12baa34baa35cc66ad836ea6c6af580cb397ab77597d234e6f80ae3a50371286eabc1fc0d3311f139fa0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipysheet"

RDEPENDS:${PN} += "-jupyter-ipywidgets >= 7.5.0 with jupyter-ipywidgets < 9 \
python3dist-ipysheet"

inherit rpm
