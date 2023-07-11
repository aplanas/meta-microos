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

RPM_NAME = "python310-ipysheet-0.7.0-2.1.noarch.rpm"
RPM_HASH = "318921cd40dc9b5c61dfccf3e888c846194f988ed7136bd3e3e87395ca1ac78fee2622aba28147cddf4e6251b67c9d7e018fa93e2f30f95a6537345d81f14002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipysheet \
python310-ipysheet \
python3dist-ipysheet"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.5.0 with python310-ipywidgets < 9 \
jupyter-ipysheet \
python-abi"

inherit rpm
