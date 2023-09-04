SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-ipyscales-0.7.0-6.1.noarch.rpm"
RPM_HASH = "e4510cd918cf2130102414e3604ecbc00fbbd53a2ef68e4a912dbf051d3243c720cb7093b9c3e32ce7c6c15f3ba811783296ee2eea23b216ef7887428420d0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyscales \
python310-ipyscales \
python310-jupyter-ipyscales \
python3dist-ipyscales"

RDEPENDS:${PN} += "jupyter-ipyscales \
python-abi \
python310-ipywidgets"

inherit rpm
