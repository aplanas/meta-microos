SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python39-vega-4.0.0-2.2.noarch.rpm"
RPM_HASH = "4437fb26f255bf5c80c00567aa8789517095238f0bca35af451895a1cf454c3341160c6c218f8fcac032a902e423da72b5fb5d3ee13f31b06068c4ba778c9a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vega \
python39-jupyter-vega \
python39-vega \
python3dist-vega"

RDEPENDS:${PN} += "python-abi \
python39-ipytablewidgets \
python39-jupyter \
python39-pandas"

inherit rpm
