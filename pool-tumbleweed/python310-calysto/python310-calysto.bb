SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python310-calysto-1.0.6-2.13.noarch.rpm"
RPM_HASH = "2cd747f189f7c1507b2f691bb35d8a4d872ce8fe0022fe3d838419b58343124a73327dfc4a55edb25293917865ddac8f98b1a6d9346600f2e260e9473ad7299b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calysto \
python3-jupyter-calysto \
python3.10dist-calysto \
python310-calysto \
python310-jupyter-calysto \
python3dist-calysto"

RDEPENDS:${PN} += "jupyter-calysto \
python-abi \
python310-CairoSVG \
python310-ipython \
python310-ipywidgets \
python310-metakernel \
python310-numpy \
python310-svgwrite"

inherit rpm
