SUMMARY = "Grid for sorting and filtering DataFrames in Jupyter notebooks"
DESCRIPTION = "An Interactive Grid for Sorting and Filtering DataFrames in Jupyter Notebook. \
 \
This package provides the jupyter notebook extension."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "jupyter-qgrid-1.3.1-5.3.noarch.rpm"
RPM_HASH = "7cf13bd49079962333d2695b595f754284a0702ed4833a36acb19813637d44afaaeccb0c280ba5aa96b0c60a5148096316642850e6b6e7a2d34e1dd53a18fcbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-qgrid"

RDEPENDS:${PN} += "jupyter-ipywidgets \
jupyter-notebook \
python3-qgrid"

inherit rpm
