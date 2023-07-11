SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python311-ipydatawidgets-4.3.2-9.3.noarch.rpm"
RPM_HASH = "1072d1f7064034842e0c8666ea00c5a565d2cf5ab149309438fdd60ddb436b6776a3535e9a6275ec525930cd22d652765883f9895d266f264b247283f2d4d9e4"
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
