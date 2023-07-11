SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "jupyter-jupyterlab-ipyvolume-0.6.3-1.2.noarch.rpm"
RPM_HASH = "6ae3f5e03e5875653267a64ef8ea536c118c465ab9cc163a9f17dda1710f97d129e558f09c19185094a99fe7c9cc9ff764e3df38fca8e1d0185e14614e2f53c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvolume"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
jupyter-ipywidgets \
jupyter-jupyterlab \
jupyter-pythreejs \
python3dist-ipyvolume"

inherit rpm
