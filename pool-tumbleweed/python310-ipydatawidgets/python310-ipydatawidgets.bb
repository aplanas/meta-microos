SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.5"

RPM_NAME = "python310-ipydatawidgets-4.3.5-10.1.noarch.rpm"
RPM_HASH = "848119d2449618c45629c783eb6aeeb3c287418dbb6d209f25e5f726a3f64b512bfb301d177ffe7830dc0bb8d202393a4e08bd349b3ff84d0aba8261583d0088"
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
