SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-ipywebrtc-0.6.0-4.1.noarch.rpm"
RPM_HASH = "ee3f44972672bfe49a1ca1d0179501ccb531495534adb1a51841865d683450d84654a5eefa7495f07df8f500d8c6b1c70fc5dc520b948a5cf7216174a12f5819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipywebrtc \
python3.11dist-ipywebrtc \
python311-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python311-ipywidgets"

inherit rpm
