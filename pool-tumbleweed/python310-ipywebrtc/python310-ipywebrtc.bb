SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-ipywebrtc-0.6.0-4.1.noarch.rpm"
RPM_HASH = "6e3ca304b65caf563f5af1d5964b7e5950ba36b27147c5fadea5f8095b0de51488772cdb3bc22833b381c397e199304e8d032eb9f8f91d78266871a06d3d2985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipywebrtc \
python310-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python310-ipywidgets"

inherit rpm
