SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "jupyter-jupyterlab-ipyvolume-0.6.1-1.3.noarch.rpm"
RPM_HASH = "abf27bef189b2c6c27ef21f6bf0a99cd3d5879f699776db0c9e98063d87d516c787cc5dcae4ca67518e22dd4f1c36e3016971067eb0e344b040dc91504946aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvolume"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
jupyter-ipywidgets \
jupyter-jupyterlab \
jupyter-pythreejs \
python3dist(ipyvolume)"

inherit rpm
