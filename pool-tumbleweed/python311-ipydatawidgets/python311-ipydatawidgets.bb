SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.5"

RPM_NAME = "python311-ipydatawidgets-4.3.5-10.1.noarch.rpm"
RPM_HASH = "b490f954fc1b1ebfbfcca38a98d648da505f7b5d400a2b78e54f44872268c966adfaed16fa7b9f17a3031d01df5e1eb57ff35c8d34cb6d9852558cbca924876c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipydatawidgets \
python3-jupyter-ipydatawidgets \
python3.11dist-ipydatawidgets \
python311-ipydatawidgets \
python311-jupyter-ipydatawidgets \
python3dist-ipydatawidgets"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
python-abi \
python311-ipywidgets \
python311-numpy \
python311-traittypes"

inherit rpm
