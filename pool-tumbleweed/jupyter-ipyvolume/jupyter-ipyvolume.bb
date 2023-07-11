SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "jupyter-ipyvolume-0.6.3-1.2.noarch.rpm"
RPM_HASH = "492c3921226daa9ea5bf3a9a85765d8c8c4f92182b7414a2696f397e50b68671847543ab6292e6e0080c9afe04fa44be891b556e2974a16425fc2a1d50f551c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvolume"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
jupyter-ipywidgets \
jupyter-notebook \
jupyter-pythreejs \
python3dist-ipyvolume"

inherit rpm
