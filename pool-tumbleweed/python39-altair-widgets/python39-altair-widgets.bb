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

RPM_NAME = "python39-altair-widgets-0.2.2-3.8.noarch.rpm"
RPM_HASH = "67132dc2761af027532cb1a2cd4e4a4b6d922416ef9bbb34d9531a2a3bf6938a261a9102d9ff911fea21f4c65a41a8654649cbfd5b5f59c10ee76bb5a8c6a29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-altair-widgets \
python39-altair-widgets \
python39-jupyter-altair-widgets \
python3dist-altair-widgets"

RDEPENDS:${PN} += "python-abi \
python39-altair \
python39-ipython \
python39-ipywidgets \
python39-pandas \
python39-vega"

inherit rpm
