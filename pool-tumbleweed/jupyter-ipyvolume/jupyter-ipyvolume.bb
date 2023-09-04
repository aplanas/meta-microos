SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "jupyter-ipyvolume-0.6.3-2.1.noarch.rpm"
RPM_HASH = "65e2dec49e70b77591e93c21ef858a69ec57f8b1fb1139e84461863ff77c8a697380dad990aeb0641e3e856d5314401048ef2d97aaf6f925a6ea9d0b40c38c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvolume"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
jupyter-ipywidgets \
jupyter-notebook \
jupyter-pythreejs \
python3dist-ipyvolume"

inherit rpm
