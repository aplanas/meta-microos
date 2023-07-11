SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-ipywebrtc-0.6.0-2.1.noarch.rpm"
RPM_HASH = "6154ebb7dd6f4abcbeef23435764a5c8b4965b5ae9ac4075a47c8ea94599f9e6401c8a3aad3c1ee454a35a9323c32bd5b6ded35cf4742933f846fcd692e8a3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipywebrtc \
python39-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python39-ipywidgets"

inherit rpm
