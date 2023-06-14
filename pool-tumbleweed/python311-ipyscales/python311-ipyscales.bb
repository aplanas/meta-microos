SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-ipyscales-0.7.0-5.4.noarch.rpm"
RPM_HASH = "5b8a47ba8785da39e092e83442803e8d684d104b5c313dc796d7d0a0120ffc125753c107a2601ad057d4d57f8fc00aad1b52ec4619398906cc1c5594ba8bbbc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ipyscales \
python311-ipyscales \
python311-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python311-ipywidgets \
python311-numpy"

inherit rpm
