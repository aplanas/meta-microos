SUMMARY = "Jupyter notebook integration for python311-plotly"
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

RPM_NAME = "python311-plotly-jupyter-5.14.1-1.2.noarch.rpm"
RPM_HASH = "9446cf088b22b2501c8a62344230952b9c62aeb3dc8236e106fbd7a4a79f94557c933d7f0f079dba805bbfe0231a1444efb061e5f1df8ffc9c1ce24252e77192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyterpython-plotly-jupyter \
python3-jupyterlab-plotly \
python3-plotly-jupyter \
python311-jupyterlab-plotly \
python311-plotly-jupyter"

RDEPENDS:${PN} += "jupyter-plotly \
python-abi \
python311-ipywidgets \
python311-plotly"

inherit rpm
