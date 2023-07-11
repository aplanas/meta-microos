SUMMARY = "Computer Vision utilities"
DESCRIPTION = "Computer Vision utilities, Cohen-Sutherland line clipping, \
OpenCV plot helpers for Optical Flow and Blob Analysis, \
and AVI codec helpers."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python3-morecvutils-1.0.2-4.11.noarch.rpm"
RPM_HASH = "b5b203b0301fdc758594efa7e656ef288c22f10aa68cbdc2b146a2b425b81f5b6e23332eb49404a21a3acc59d27ba14f193b9afd96341737cb376add13eaf7bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-morecvutils \
python3.11dist-morecvutils \
python3dist-morecvutils"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
gstreamer-plugins-good \
python-abi \
python3-imageio \
python3-imageio-ffmpeg \
python3-numpy \
python3-opencv"

inherit rpm
