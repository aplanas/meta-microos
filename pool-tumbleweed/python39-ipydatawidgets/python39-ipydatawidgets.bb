SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python39-ipydatawidgets-4.3.2-9.2.noarch.rpm"
RPM_HASH = "3b77b26afa88fd10df0be0ff743170521691e1ba1d2350cd219ac0b2c289155854ef311c9d94576e8dac6d96ab3e2a6685d6b9ccabe549ee2fb52ca0a2700455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipydatawidgets) \
python39-ipydatawidgets \
python39-jupyter_ipydatawidgets \
python3dist(ipydatawidgets)"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
python(abi) \
python39-ipywidgets \
python39-numpy \
python39-traittypes"

inherit rpm
