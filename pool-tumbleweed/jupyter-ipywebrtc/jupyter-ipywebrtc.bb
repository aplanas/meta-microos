SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the jupyter notebook and jupyterlab \
extensions."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "jupyter-ipywebrtc-0.6.0-2.1.noarch.rpm"
RPM_HASH = "1a1cf4d56fe29094946aebfafb95d31392e317461c41c7f42b368713c73d00857e1a8275aca358b2b4dc773c3a84ed6161afabcd4393b5403d58202e6b8d4e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jupyter-ipywebrtc \
jupyter-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywidgets \
jupyter-jupyterlab \
jupyter-notebook \
python3dist-ipywebrtc"

inherit rpm
