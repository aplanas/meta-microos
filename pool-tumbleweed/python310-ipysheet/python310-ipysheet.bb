SUMMARY = "Spreadsheet widget for the Jupyter notebook"
DESCRIPTION = "A Jupyter widget providing spreadsheets for the Jupyter notebook. \
 \
WARNING \
Due to Handsontable licensing changes ipysheet is stuck witch the \
outdated Handsontable version 6.2.2 (open-source). We recommend \
not using ipysheet anymore. We suggest an alternative like \
ipydatagrid. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-ipysheet-0.7.0-3.1.noarch.rpm"
RPM_HASH = "82e9c6f81beda7dbd7887745cc217da370fb2d74bf30379b2ea4a43211b8f4398a49796c0ab03cfdfe646fe11224ce54282bdaa6035167afbbd8b618ad07b7a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipysheet \
python310-ipysheet \
python3dist-ipysheet"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.5.0 with python310-ipywidgets < 9 \
jupyter-ipysheet \
python-abi"

inherit rpm
