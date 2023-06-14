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

RPM_NAME = "python39-altair-widgets-0.2.2-3.7.noarch.rpm"
RPM_HASH = "90630ebc1470cbc39a04f6933d0fe64e6957b162f75d234a434c7fc83062356af7d9950b4602c17200a3c1aa7528fb5cfe3d1bee6376b32c5fce357a707fa237"
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
