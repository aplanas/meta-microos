SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-ipyscales-0.7.0-5.5.noarch.rpm"
RPM_HASH = "795c1726469300c0d6206da091cdc116cde4771fe65f4b0cae4c1165b9ce4442c53f1b11daf240c54289c67fe58437615a352153a4e1b777d2cd2cae5750d46b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyscales \
python3-jupyter-ipyscales \
python3.11dist-ipyscales \
python311-ipyscales \
python311-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python311-ipywidgets \
python311-numpy"

inherit rpm
