SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python310-ipyvue-1.9.2-1.2.noarch.rpm"
RPM_HASH = "c7933cc2ce22818f05a808bd31987acc413f701f15ceb6ef90fdf72c077efb9a95a305703db08fe77705afdff5ed4cdf0c8260a701f0896e369ff771a7d43512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyvue \
python310-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets"

inherit rpm
