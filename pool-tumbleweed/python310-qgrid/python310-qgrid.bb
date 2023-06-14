SUMMARY = "Grid for sorting and filtering DataFrames in Jupyter notebooks"
DESCRIPTION = "An Interactive Grid for Sorting and Filtering DataFrames in Jupyter Notebook. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python310-qgrid-1.3.1-5.3.noarch.rpm"
RPM_HASH = "cd1f57d87b6febaa4ac8bf97197b418bbb5f136ed81fdc7a35e058bf34da938b2c7a9048f564bae0abee0c0a37d8f875a561a6bef6d520efacfe2ee11ca1dddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qgrid \
python3.10dist-qgrid \
python310-qgrid \
python3dist-qgrid"

RDEPENDS:${PN} += "jupyter-qgrid \
python-abi \
python310-ipywidgets \
python310-notebook \
python310-pandas"

inherit rpm
