SUMMARY = "Interactive visualization package for statistical data for Python"
DESCRIPTION = "This package provides interactive data visualization tools in the Jupyter \
Notebook. \
 \
The interactive visualization tool that is provided allows data selection \
through HTML widgets and outputs a Vega-lite plot through Altair. In the HTML \
widget it is possible to select columns to plot in various encodings. This \
widget also supports some basic configuration (i.e., log vs linear scales)."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-altair-widgets-0.2.2-3.8.noarch.rpm"
RPM_HASH = "931185f7cb4ac46e0b3f72e88fcd9dfdab96bf350bc223c903ccfd33c49876f2de3ce8e14c253fd68e046eac38d4f0c542f9c5c0bf3dc7f51dbb714f5c03ef14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-altair-widgets \
python310-altair-widgets \
python310-jupyter-altair-widgets \
python3dist-altair-widgets"

RDEPENDS:${PN} += "python-abi \
python310-altair \
python310-ipython \
python310-ipywidgets \
python310-pandas \
python310-vega"

inherit rpm
