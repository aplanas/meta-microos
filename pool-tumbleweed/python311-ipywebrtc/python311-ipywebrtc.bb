SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-ipywebrtc-0.6.0-1.17.noarch.rpm"
RPM_HASH = "9b94f5c86df6f4c960a7d4bafda590d62b8b66e56d2058c76d82035215ae83bcdfe3e7949f51525f7fbb376b9e764f4ededa07ca9b06b5f9f92d5d3ef5cd971e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ipywebrtc \
python311-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python311-ipywidgets"

inherit rpm
