SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python310-ipydatawidgets-4.3.2-9.4.noarch.rpm"
RPM_HASH = "543287f2adf55027dd640a116e2baa56baddd23c158685678e1939781e85a5c93751824d7b3fbd79cad76581b5ca90213e1c17b8788fac5e87d9bee0133f04bf"
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
