SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-ipyscales-0.7.0-6.1.noarch.rpm"
RPM_HASH = "5d057a0d7ef4b8c2d00e83055569fc6e54db825e65f8aa7ba3c3bd265c8c9fdd7cfb16377911a2075ec33e4ec7fd5b4650ee9ac7105d3dee9086f44d287e0377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyscales \
python39-ipyscales \
python39-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python39-ipywidgets"

inherit rpm
