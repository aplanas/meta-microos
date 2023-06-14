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

PV = "5.13.1"

RPM_NAME = "python311-plotly-jupyter-5.13.1-1.3.noarch.rpm"
RPM_HASH = "1c0768c0ec2fdb438f2f9e198041c68e8dba8417ad62ba8d96a3d8ad6079f0c7bfb96fb55273b7da3d709977a61d0dd61399518641efa80186e0d88ea3db68d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyterlab-plotly \
python311-plotly-jupyter"

RDEPENDS:${PN} += "-python311-jupyterlab >= 3 or python311-notebook >= 5.3 \
jupyter-plotly \
python-abi \
python311-ipywidgets \
python311-plotly"

inherit rpm
