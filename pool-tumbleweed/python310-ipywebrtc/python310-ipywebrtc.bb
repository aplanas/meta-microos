SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-ipywebrtc-0.6.0-1.17.noarch.rpm"
RPM_HASH = "4f4990894b6818deabbd66e803ecd0a3c897c62af3b63283a9b803e767407c5cbed47e0b6114afcaa1ed2279709be3332054b247eb1d3ad829b43edb54d37c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipywebrtc \
python3.10dist-ipywebrtc \
python310-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python310-ipywidgets"

inherit rpm
