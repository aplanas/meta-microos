SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-ipywebrtc-0.6.0-2.1.noarch.rpm"
RPM_HASH = "2807b7b3d212328c3161458829321cdc83d73ca9a1d18e2856518e2f87e83d8fd1bbe2e8df70b0f67dcff900ad415408c8b5c132da6e307e0181e1519203b64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipywebrtc \
python3.11dist-ipywebrtc \
python311-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python311-ipywidgets"

inherit rpm
