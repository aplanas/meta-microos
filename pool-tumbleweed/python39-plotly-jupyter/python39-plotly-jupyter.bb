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

PV = "5.14.1"

RPM_NAME = "python39-plotly-jupyter-5.14.1-1.2.noarch.rpm"
RPM_HASH = "5096307995623388ac55369bdb6c958a4d2c67b1ff04cc3b4bfb41650495ce7f6638d7f0783bef64079f0d3ce3d4a830ea07e350cf03c89faf2668551c15b263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyterpython-plotly-jupyter \
python39-jupyterlab-plotly \
python39-plotly-jupyter"

RDEPENDS:${PN} += "jupyter-plotly \
python-abi \
python39-ipywidgets \
python39-plotly"

inherit rpm
