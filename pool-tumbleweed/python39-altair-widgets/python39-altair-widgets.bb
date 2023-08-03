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

RPM_NAME = "python39-altair-widgets-0.2.2-3.9.noarch.rpm"
RPM_HASH = "ed988f8f80dd4c5adaf51fa8bb98b76e36e8f00ed1337623bbaea298f7fe92b43e10fe225a0c3d84c9c23e538054e29817fac4cd654fe931194bb495b9817f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-altair-widgets \
python39-altair-widgets \
python39-jupyter-altair-widgets \
python3dist-altair-widgets"

RDEPENDS:${PN} += "python-abi \
python39-altair \
python39-ipython \
python39-ipywidgets \
python39-pandas \
python39-vega"

inherit rpm
