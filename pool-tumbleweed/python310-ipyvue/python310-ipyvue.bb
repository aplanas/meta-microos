SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python310-ipyvue-1.9.2-2.1.noarch.rpm"
RPM_HASH = "ec013e0e691220587f5e7a87ec138d6f6fc085db9517914693de51bce76b2e06a7d8446a88ffa47dd8ee6fc5c32268309a65189cf633891b0639556312e9b041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipyvue \
python310-ipyvue \
python3dist-ipyvue"

RDEPENDS:${PN} += "python-abi \
python310-ipywidgets"

inherit rpm
