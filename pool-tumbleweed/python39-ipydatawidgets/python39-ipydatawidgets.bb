SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.5"

RPM_NAME = "python39-ipydatawidgets-4.3.5-10.1.noarch.rpm"
RPM_HASH = "2e6385ee5ac1a0610874655d1bd5a321b8e87ace5cd75789d41ba65eddbdd5ae774d9abc527298017590b31359d8e4ce6a781fa1ed155e562c72723e8ec46105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipydatawidgets \
python39-ipydatawidgets \
python39-jupyter-ipydatawidgets \
python3dist-ipydatawidgets"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
python-abi \
python39-ipywidgets \
python39-numpy \
python39-traittypes"

inherit rpm
