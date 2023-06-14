SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python311-ipydatawidgets-4.3.2-9.2.noarch.rpm"
RPM_HASH = "a33bf1c16b423a99343afca6bc4832bfce8faee441745d40f1c760d44fe21987833dd7faae5ea28ca6d890ddc0f058599a9cd6332501b2eb2ff1fef397f770a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ipydatawidgets \
python311-ipydatawidgets \
python311-jupyter-ipydatawidgets \
python3dist-ipydatawidgets"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
python-abi \
python311-ipywidgets \
python311-numpy \
python311-traittypes"

inherit rpm
