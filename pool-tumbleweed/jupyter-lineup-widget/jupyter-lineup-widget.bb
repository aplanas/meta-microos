SUMMARY = "Python package to export interactive HTML pages from Jupyter Notebooks"
DESCRIPTION = "NBinteract is a Python package that creates interactive webpages from Jupyter \
notebooks. NBinteract also has built-in support for interactive plotting. \
These interactions are driven by data, not callbacks, allowing authors to focus \
on the logic of their programs. \
 \
This package provides the jupyter notebook extensions."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "jupyter-lineup-widget-4.0.0-1.9.noarch.rpm"
RPM_HASH = "badadc723f380c795d3c7fd2d63d7acb27f31ac3f3b38765b4ad9637b63bf9cea5568c72ee1d24c4ea544bd18bd2554b06a8b7e414ddc1a0c5e7193f06d7045e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jupyter-lineup-widget \
jupyter-lineup-widget"

RDEPENDS:${PN} += "jupyter-ipywidgets \
jupyter-notebook \
python3-lineup-widget"

inherit rpm
