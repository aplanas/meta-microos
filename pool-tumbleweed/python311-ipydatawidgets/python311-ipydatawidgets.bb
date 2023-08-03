SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python311-ipydatawidgets-4.3.2-9.4.noarch.rpm"
RPM_HASH = "12f7d1a1332ee3176b8c5ea3727d6e1e585d5a61082e251825a77ac5461e6813910b7a58d469f8f22ab17459ba426ca42293e3400afd3ddb5fdb92b1b877fb18"
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
