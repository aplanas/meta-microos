SUMMARY = "Python package to export interactive HTML pages from Jupyter Notebooks"
DESCRIPTION = "NBinteract is a Python package that creates interactive webpages from Jupyter \
notebooks. NBinteract also has built-in support for interactive plotting. \
These interactions are driven by data, not callbacks, allowing authors to focus \
on the logic of their programs. \
 \
This package provides the jupyter notebook extensions."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "jupyter-lineup-widget-4.0.0-1.8.noarch.rpm"
RPM_HASH = "e07e6077afee11bc92e3bc12231a67fac98ac9b43e01612a6462733e468096a8e2a69238b45bbf3bea05280dcccc87b9e79e5ce4fdd5d94786fc23d460a598b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(jupyter-lineup-widget) \
jupyter-lineup-widget"

RDEPENDS:${PN} += "jupyter-ipywidgets \
jupyter-notebook \
python3-lineup-widget"

inherit rpm
