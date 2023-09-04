SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "jupyter-jupyterlab-ipyvolume-0.6.3-2.1.noarch.rpm"
RPM_HASH = "75514fd6f4f20a9af280468593b15de80101f02f47ec835dc0ef2d5b732542edd943d6722cd499724df44e7bd096c29b8fc41fabcf8f2c61a62aa77b245efab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvolume"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
jupyter-ipywidgets \
jupyter-jupyterlab \
jupyter-pythreejs \
python3dist-ipyvolume"

inherit rpm
