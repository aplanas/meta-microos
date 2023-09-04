SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python311-calysto-1.0.6-2.15.noarch.rpm"
RPM_HASH = "c993e77fd93e627dcaf7235c512743d3d971af2851c9ae1caf837bad25e5f49df0f6ca6a81d94d12553f32ee2bba7363b6f39fd410a023aa2cffe78d031c98b7"
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
