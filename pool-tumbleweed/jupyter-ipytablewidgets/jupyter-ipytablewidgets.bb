SUMMARY = "Jupyter Notebook extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyter notebook extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "jupyter-ipytablewidgets-0.3.1-1.3.noarch.rpm"
RPM_HASH = "bf3a35791d9bb5dc1cba7c9fa007dcf9a37eb694ddae5b0d4304eb04f00af36fbd56298e1e83698b2d9e999d06017a21e8206026c1088f4108020df9e396c114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets"

RDEPENDS:${PN} += "python3dist-ipytablewidgets"

inherit rpm
