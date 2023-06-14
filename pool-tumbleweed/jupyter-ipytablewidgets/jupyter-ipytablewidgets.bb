SUMMARY = "Jupyter Notebook extension for python-ipytablewidgets"
DESCRIPTION = "Traitlets and widgets to efficiently data tables (e.g. Pandas DataFrame) using the jupyter notebook \
 \
This package provides the jupyter notebook extension"
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "jupyter-ipytablewidgets-0.3.1-1.1.noarch.rpm"
RPM_HASH = "9719b057e50b69f4cc0ce25d1922d8d23081b7b85372cc701cffb9f570e5bb8db962ff368d32bd665bf972d5fa7f607bb96e3f5ecd5192ab223faf8da9cb9418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipytablewidgets"

RDEPENDS:${PN} += "python3dist-ipytablewidgets"

inherit rpm
