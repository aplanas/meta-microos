SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python310-ipydatawidgets-4.3.2-9.3.noarch.rpm"
RPM_HASH = "40a4ef730c76338e72ff64d8282e2ea6f3fd6dd1162fff61a138e523e5bd0faca9469f6df13d30db8e3146c92059aaf9fdbee0f39074b1aa79c7f0a94d5675b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipydatawidgets \
python310-ipydatawidgets \
python310-jupyter-ipydatawidgets \
python3dist-ipydatawidgets"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
python-abi \
python310-ipywidgets \
python310-numpy \
python310-traittypes"

inherit rpm
