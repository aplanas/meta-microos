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

RPM_NAME = "python310-ipysheet-0.7.0-1.5.noarch.rpm"
RPM_HASH = "544090e83f8b8f16e9cb1428da37e3c9573544a2039f1e5b5eb68117c77929d6a0d6718e516f7095b9e00c27cdc839f8855213a1827991049e5cbf768aae9b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipysheet \
python3.10dist(ipysheet) \
python310-ipysheet \
python3dist(ipysheet)"

RDEPENDS:${PN} += "(python310-ipywidgets >= 7.5.0 with python310-ipywidgets < 9) \
jupyter-ipysheet \
python(abi)"

inherit rpm
