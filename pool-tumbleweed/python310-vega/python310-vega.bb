SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python310-vega-4.0.0-2.2.noarch.rpm"
RPM_HASH = "4f131725a0b7c73a1f8dce8717d817a0a91bbb27ee87d2293b1ecacf921c392cae9975ba5a787876412ada8fde3bcf52cbb0093d3a751b6c16b2474cb6dba0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vega \
python310-jupyter-vega \
python310-vega \
python3dist-vega"

RDEPENDS:${PN} += "python-abi \
python310-ipytablewidgets \
python310-jupyter \
python310-pandas"

inherit rpm
