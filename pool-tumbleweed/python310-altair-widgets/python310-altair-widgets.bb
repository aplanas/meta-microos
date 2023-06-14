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

RPM_NAME = "python310-altair-widgets-0.2.2-3.7.noarch.rpm"
RPM_HASH = "e9662a05809de223f9b988a9a76097a17825416ecc83a4d0995929b816d3d4f505af33c630765856b3a1a89f9682c27c7174f8a7306b981429c968528bcdb260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-altair-widgets \
python3-altair-widgets \
python3-jupyter-altair-widgets \
python3.10dist-altair-widgets \
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
