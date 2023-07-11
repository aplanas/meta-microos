SUMMARY = "Jupyterlab extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyterlab extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "jupyter-ipytablewidgets-jupyterlab-0.3.1-1.3.noarch.rpm"
RPM_HASH = "ac90d9df15a07f507012d3b8d3724556b2975d8eba36218e91e9b553e6c61156d17f1d4f2f802200260fa276776304de65304164354d74de1fa8a7e3c9fae631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets-jupyterlab"

RDEPENDS:${PN} += "python3dist-ipytablewidgets"

inherit rpm
