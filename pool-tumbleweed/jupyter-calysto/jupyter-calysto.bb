SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the jupyter components."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "jupyter-calysto-1.0.6-2.15.noarch.rpm"
RPM_HASH = "9b118a6e5feefda05bad76d8519867cc56b0088f3ecde76709bf1be7ebcd544ab5cc3b9d8d660114c890f5dce015e103346b80cce0300668df155f60093895a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-calysto"

RDEPENDS:${PN} += "jupyter-ipython \
jupyter-ipywidgets \
jupyter-metakernel \
python3-calysto"

inherit rpm
