SUMMARY = "Jupyter Notebook extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyter notebook extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "jupyter-ipytablewidgets-0.3.1-2.1.noarch.rpm"
RPM_HASH = "f406f4699c674eb4749f50842757f534d6417ba47f2521028c441c68c00dea03256e1ca28bb018912090bb0cc7019410410e4dbc2f04b338b0abc10c6b1298c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets"

RDEPENDS:${PN} += "python3dist-ipytablewidgets"

inherit rpm
