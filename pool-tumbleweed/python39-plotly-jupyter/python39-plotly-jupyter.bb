SUMMARY = "Jupyter notebook integration for python39-plotly"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph. \
 \
This package provides Jupyterlab and Notebook integration and widgets."
LICENSE = "MIT"

PV = "5.13.1"

RPM_NAME = "python39-plotly-jupyter-5.13.1-1.3.noarch.rpm"
RPM_HASH = "ce9f846599015f97b3a91ca232351b0a4ca61f5beae13021a26c8e9d322c065d16660d342308801a340d45d1b39732cc86aa41ad3b643614c9f37ac275c54d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-plotly \
python39-plotly-jupyter"

RDEPENDS:${PN} += "(python39-jupyterlab >= 3 or python39-notebook >= 5.3) \
jupyter-plotly \
python(abi) \
python39-ipywidgets \
python39-plotly"

inherit rpm
