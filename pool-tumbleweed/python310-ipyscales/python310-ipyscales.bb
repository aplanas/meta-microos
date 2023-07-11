SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-ipyscales-0.7.0-5.5.noarch.rpm"
RPM_HASH = "5f9060a31e44f76866dfeaa48c2205ec1b1790e96756b646812b982626ac9d81d2c4b2b262eb6bef2d3180a1dd788fa15984e393f9a7e17e4dd22e92026ece03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyscales \
python310-ipyscales \
python310-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python310-ipywidgets \
python310-numpy"

inherit rpm
