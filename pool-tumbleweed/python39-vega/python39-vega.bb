SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python39-vega-4.0.0-2.1.noarch.rpm"
RPM_HASH = "89ef44213e3ed6f45ac306415e21c37a421d1c0ed79bb2bd5445df6dbcd47e72d22118322b4c2a469d099aeb23b1fb99b234eb9f15c7720e2aae42cc38a1211d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vega) \
python39-jupyter_vega \
python39-vega \
python3dist(vega)"

RDEPENDS:${PN} += "python(abi) \
python39-ipytablewidgets \
python39-jupyter \
python39-pandas"

inherit rpm
