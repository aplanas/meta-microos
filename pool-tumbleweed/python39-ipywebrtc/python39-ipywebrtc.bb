SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-ipywebrtc-0.6.0-4.1.noarch.rpm"
RPM_HASH = "33a010b6a39f7bac3d266faff49cb27fa23ea47b11704ba67c2b0a537175b899b4eb07807809ea31f06493c82ff18c093ab44557a8ace58cd15f21eb4c5ba73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipywebrtc \
python39-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python39-ipywidgets"

inherit rpm
