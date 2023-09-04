SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-ipyscales-0.7.0-6.1.noarch.rpm"
RPM_HASH = "912d33b4de6df4136c990a9f8873199f24a7c030b1bf22e1e79ea3500bf866f890e58c5dc9b5ddf99d014e53a3191aa589872d05cd4c56c6cf058ab0df0d67f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyscales \
python3-jupyter-ipyscales \
python3.11dist-ipyscales \
python311-ipyscales \
python311-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python311-ipywidgets"

inherit rpm
