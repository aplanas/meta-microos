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

RPM_NAME = "python310-altair-widgets-0.2.2-3.9.noarch.rpm"
RPM_HASH = "33a3eb461412110cbab72323fdf40fd94539e63018c6dfe4303d041f4a99c48d05dd845942a03794ec4b068429423c2c1309c7892e8f68182529da698aa8003e"
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
