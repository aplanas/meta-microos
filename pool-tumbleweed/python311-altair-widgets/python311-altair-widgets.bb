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

RPM_NAME = "python311-altair-widgets-0.2.2-3.9.noarch.rpm"
RPM_HASH = "f772482d7c4710dd05329dafa560960067af1d6b92bd53291312387bff2aab9153aacd372171bf174f4fc7ae42cd2e773b88ed59f4cce8479c9e4684777784b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-altair-widgets \
python3-altair-widgets \
python3-jupyter-altair-widgets \
python3.11dist-altair-widgets \
python311-altair-widgets \
python311-jupyter-altair-widgets \
python3dist-altair-widgets"

RDEPENDS:${PN} += "python-abi \
python311-altair \
python311-ipython \
python311-ipywidgets \
python311-pandas \
python311-vega"

inherit rpm
