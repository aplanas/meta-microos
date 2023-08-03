SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python39-ipydatawidgets-4.3.2-9.4.noarch.rpm"
RPM_HASH = "fb1d500104d6d8e8b9b1a0dedf32a8a606fbca2bcd1485bb62f67b001f27bbb59a74dc9bdb16b298d05cc8271111d19532a52b4ab7b6d986ed08530ead27ebfa"
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
