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

RPM_NAME = "python39-ipysheet-0.7.0-3.1.noarch.rpm"
RPM_HASH = "879159a7d6850b95f416e57d55c8d23d7de14649c33f9f387e85264bd8470ab44566170f3ea1fcfa3ff51de6504fad7b591a9061971ef01333cc03fd0dad0823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipysheet \
python39-ipysheet \
python3dist-ipysheet"

RDEPENDS:${PN} += "-python39-ipywidgets >= 7.5.0 with python39-ipywidgets < 9 \
jupyter-ipysheet \
python-abi"

inherit rpm
