SUMMARY = "Python package to export interactive HTML pages from Jupyter Notebooks"
DESCRIPTION = "NBinteract is a Python package that creates interactive webpages from Jupyter \
notebooks. NBinteract also has built-in support for interactive plotting. \
These interactions are driven by data, not callbacks, allowing authors to focus \
on the logic of their programs. \
 \
This package provides the jupyter notebook extensions."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "jupyter-lineup-widget-4.0.0-2.1.noarch.rpm"
RPM_HASH = "215bf368cd45562cc94b7aa864705ff4e4b1859c2d69abf8716edba5856a9b3c791bd8e8dee0771b313ea8eeb07520244ef571cbd82caf3a9f37bb620ecdd804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-lineup-widget"

RDEPENDS:${PN} += "jupyter-ipywidgets \
python3dist-lineup-widget"

inherit rpm
