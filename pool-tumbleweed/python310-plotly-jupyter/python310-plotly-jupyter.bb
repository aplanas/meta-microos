SUMMARY = "Jupyter notebook integration for python310-plotly"
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

RPM_NAME = "python310-plotly-jupyter-5.13.1-1.3.noarch.rpm"
RPM_HASH = "d11d6122d7507c82b7bf2a88d518573ec1b582fed723c723e2dda07f38ad9cfa79ec9e173aaab794975bcdee53dfa330c27334ef3489ea620d44fb4f4f2869eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-plotly \
python3-plotly-jupyter \
python310-jupyterlab-plotly \
python310-plotly-jupyter"
RDEPENDS:${PN} += "(python310-jupyterlab >= 3 or python310-notebook >= 5.3) \
jupyter-plotly \
python(abi) \
python310-ipywidgets \
python310-plotly"

inherit rpm
