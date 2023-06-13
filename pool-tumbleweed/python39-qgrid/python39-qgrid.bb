SUMMARY = "Grid for sorting and filtering DataFrames in Jupyter notebooks"
DESCRIPTION = "An Interactive Grid for Sorting and Filtering DataFrames in Jupyter Notebook. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python39-qgrid-1.3.1-5.3.noarch.rpm"
RPM_HASH = "85b2f59e3db4e48af807986bc2cb2a10b13f4f21a99d99e11c32497da3cf8d7fb36691c5a5f16f13d89b2165fabb59f393dceb73b13d3f0f34d08bd74a09c0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(qgrid) \
python39-qgrid \
python3dist(qgrid)"

RDEPENDS:${PN} += "jupyter-qgrid \
python(abi) \
python39-ipywidgets \
python39-notebook \
python39-pandas"

inherit rpm
