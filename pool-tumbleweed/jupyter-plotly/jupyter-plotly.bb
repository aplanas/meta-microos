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

PV = "5.14.1"

RPM_NAME = "jupyter-plotly-5.14.1-1.2.noarch.rpm"
RPM_HASH = "c956e320e137da90fdfdde4c0c3d897dcb323f4a97f6024cfd023ed9b094bd99e543522b3b9b7e4155d36b8de35e8afe627f1819b116da9633d0103593380acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-plotly \
jupyterlab-plotly"

RDEPENDS:${PN} += "jupyterpython-plotly-jupyter"

inherit rpm
