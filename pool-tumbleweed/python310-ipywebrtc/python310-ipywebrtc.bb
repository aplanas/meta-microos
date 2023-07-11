SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-ipywebrtc-0.6.0-2.1.noarch.rpm"
RPM_HASH = "44a631f61e9e1c522f13815b5b8aadbd4c981fd3671fc1d1f80f59a7180c7d05a8d755541db7787fbfd06cd79d4e587be288ff0e59e23baf62aabf4140232cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipywebrtc \
python310-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python310-ipywidgets"

inherit rpm
