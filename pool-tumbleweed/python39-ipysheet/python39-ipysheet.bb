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

RPM_NAME = "python39-ipysheet-0.7.0-2.1.noarch.rpm"
RPM_HASH = "5392dc5d44fb97606793c12d067c2d9ec43d6c58ee61e4422883ae24623bd49c7511f7d02cc46cbfcdde722f449442a60e00e6431e76db6a1d83f4d71ac5ccc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipysheet \
python39-ipysheet \
python3dist-ipysheet"

RDEPENDS:${PN} += "-python39-ipywidgets >= 7.5.0 with python39-ipywidgets < 9 \
jupyter-ipysheet \
python-abi"

inherit rpm
