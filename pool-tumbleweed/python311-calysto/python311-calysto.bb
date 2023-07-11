SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python311-calysto-1.0.6-2.14.noarch.rpm"
RPM_HASH = "7c84912d37e4b82607a50a12d400274e938f2139f83939f8df15e5fcd9b506bd553af24fd689a6b2ffd3d90348c4e5280b60c24a85fdcbbd1466103f7e599d62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calysto \
python3-jupyter-calysto \
python3.11dist-calysto \
python311-calysto \
python311-jupyter-calysto \
python3dist-calysto"

RDEPENDS:${PN} += "jupyter-calysto \
python-abi \
python311-CairoSVG \
python311-ipython \
python311-ipywidgets \
python311-metakernel \
python311-numpy \
python311-svgwrite"

inherit rpm
