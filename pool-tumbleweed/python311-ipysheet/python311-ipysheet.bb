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

RPM_NAME = "python311-ipysheet-0.7.0-3.1.noarch.rpm"
RPM_HASH = "53cb1443f8341897713cc8853bc6f8a33f925f62a42dc364b10c7ddcd5fa815289f60324e1a9f407a2ce6bccd8976bd7058c0bad1870aa2773b6e0ba005018ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipysheet \
python3.11dist-ipysheet \
python311-ipysheet \
python3dist-ipysheet"

RDEPENDS:${PN} += "-python311-ipywidgets >= 7.5.0 with python311-ipywidgets < 9 \
jupyter-ipysheet \
python-abi"

inherit rpm
