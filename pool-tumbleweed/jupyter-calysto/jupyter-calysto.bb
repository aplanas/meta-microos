SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the jupyter components."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "jupyter-calysto-1.0.6-2.14.noarch.rpm"
RPM_HASH = "1a4cad7e7ca8aae1f05a85fb6c7a0aec707e3ee906b0022e164527f992fbea9e1ccdbe7063fd9d94a4937694eaedec0b7e7b7b9c5e0b40ef8a98309894277d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-calysto"

RDEPENDS:${PN} += "jupyter-ipython \
jupyter-ipywidgets \
jupyter-metakernel \
python3-calysto"

inherit rpm
