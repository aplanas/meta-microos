SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python311-vega-4.0.0-2.2.noarch.rpm"
RPM_HASH = "8b7e8b63ec9dbcda5904c0ffcda9dccab5614d01c262766e40dcfbdd6232498ac5d333a047088650f46a7b76781ecc438e325a988bdb581d64049483119f15b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-vega \
python3-jupyter-vega \
python3-vega \
python3.11dist-vega \
python311-jupyter-vega \
python311-vega \
python3dist-vega"

RDEPENDS:${PN} += "python-abi \
python311-ipytablewidgets \
python311-jupyter \
python311-pandas"

inherit rpm
