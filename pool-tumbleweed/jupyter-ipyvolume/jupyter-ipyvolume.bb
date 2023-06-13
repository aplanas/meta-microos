SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "jupyter-ipyvolume-0.6.1-1.3.noarch.rpm"
RPM_HASH = "35d4922d6745d9c157eb98134fd15469582fb853943c32b23feb93913990d6f4ca279aa8aeddd89d1876d25cfe7a3a0e296f433ba0077bc652ea086f4a087a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvolume"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
jupyter-ipywidgets \
jupyter-notebook \
jupyter-pythreejs \
python3dist(ipyvolume)"

inherit rpm
