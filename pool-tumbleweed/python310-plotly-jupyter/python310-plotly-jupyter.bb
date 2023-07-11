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

PV = "5.14.1"

RPM_NAME = "python310-plotly-jupyter-5.14.1-1.2.noarch.rpm"
RPM_HASH = "a99704b60953918475b7ab7404faad58d346a63b934aef25af37d0820c6490da959e25fccd1cb43258af33c1f239cd9bb90d1957aecf8df8b68796b20dd2e20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyterpython-plotly-jupyter \
python310-jupyterlab-plotly \
python310-plotly-jupyter"

RDEPENDS:${PN} += "jupyter-plotly \
python-abi \
python310-ipywidgets \
python310-plotly"

inherit rpm
