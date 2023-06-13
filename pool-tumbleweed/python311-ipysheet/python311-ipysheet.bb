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

RPM_NAME = "python311-ipysheet-0.7.0-1.5.noarch.rpm"
RPM_HASH = "2381d44d5f79f0cdd2386559aa00d9afbecf7e8a837870495977937d090456e2063267228aab4c930f26452e16764ca9b5e316e8522ff5d53c419890a6ec99b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipysheet) \
python311-ipysheet \
python3dist(ipysheet)"

RDEPENDS:${PN} += "(python311-ipywidgets >= 7.5.0 with python311-ipywidgets < 9) \
jupyter-ipysheet \
python(abi)"

inherit rpm
