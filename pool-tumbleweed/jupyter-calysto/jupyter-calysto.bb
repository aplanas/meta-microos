SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the jupyter components."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "jupyter-calysto-1.0.6-2.13.noarch.rpm"
RPM_HASH = "69d073d9fda2b3dd3fa5fa192d6fbf51ffd8cce77b102822db1281732de65d633ec7b812bcce3dffc10ecb317d55d8b4f979d8d3675dce5c2d06b83787650fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-calysto"

RDEPENDS:${PN} += "jupyter-ipython \
jupyter-ipywidgets \
jupyter-metakernel \
python3-calysto"

inherit rpm
