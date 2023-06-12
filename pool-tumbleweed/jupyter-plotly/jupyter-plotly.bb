SUMMARY = "Jupyter notebook integration for python-plotly"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph. \
 \
This package provides the flavorless configuration for the \
Jupyterlab and Notebook integration and widgets."
LICENSE = "MIT"

PV = "5.13.1"

RPM_NAME = "jupyter-plotly-5.13.1-1.3.noarch.rpm"
RPM_HASH = "5001a370166b9cf6a5d73f93e1611b243d645aadad61a00e274a25c71fbf2f5704cf60a16c6067cc396e0bf3db55c3809cbb3ffee7783e538d697f0c58dac059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-plotly \
jupyterlab-plotly"
RDEPENDS:${PN} += "python3-plotly-jupyter"

inherit rpm
