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

RPM_NAME = "python311-ipysheet-0.7.0-2.1.noarch.rpm"
RPM_HASH = "c90b387413572d711115a33333c5cde1786ed80a8ec5ccbc193456063d3fc7dc2f4b1f1ec990ae50520308629b2ecb508a2992975924c1a374307159dd7da5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipysheet \
python3.11dist-ipysheet \
python311-ipysheet \
python3dist-ipysheet"

RDEPENDS:${PN} += "-python311-ipywidgets >= 7.5.0 with python311-ipywidgets < 9 \
jupyter-ipysheet \
python-abi"

inherit rpm
