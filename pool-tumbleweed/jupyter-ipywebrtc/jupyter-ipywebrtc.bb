SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the jupyter notebook and jupyterlab \
extensions."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "jupyter-ipywebrtc-0.6.0-1.17.noarch.rpm"
RPM_HASH = "306000347f9dc3be5665d1d4d535d2031837b41c70095437b97bad5b08d32018e840e63f4a9572b252a2ebe3da20d0949597563e9d06f0337d1cf0d288dd70fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(jupyter-ipywebrtc) \
jupyter-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywidgets \
jupyter-jupyterlab \
jupyter-notebook \
python3-ipywebrtc"

inherit rpm
