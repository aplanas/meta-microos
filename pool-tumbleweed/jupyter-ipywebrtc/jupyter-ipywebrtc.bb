SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the jupyter notebook and jupyterlab \
extensions."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "jupyter-ipywebrtc-0.6.0-4.1.noarch.rpm"
RPM_HASH = "a81455b71b9e474e27841afa3b2012ba98d151fe483557d1ea7e9c2502585c3c0f3dbee5e7af64a9cfd9065b4c8bdcdd9bc70000e5ef650c8f0c117c6b9108e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywidgets \
python3dist-ipywebrtc"

inherit rpm
