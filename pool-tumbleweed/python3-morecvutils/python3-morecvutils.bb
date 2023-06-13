SUMMARY = "Computer Vision utilities"
DESCRIPTION = "Computer Vision utilities, Cohen-Sutherland line clipping, \
OpenCV plot helpers for Optical Flow and Blob Analysis, \
and AVI codec helpers."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python3-morecvutils-1.0.2-4.10.noarch.rpm"
RPM_HASH = "c7b224c9cc1ee1b973321c31fb1ba87e8d488cb99755b44aa29e7169927fc87fffe0ac4c18add12a7dc1498e0cb27a252354fa2bdfdb211f6bd67217a23dd1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-morecvutils \
python3.10dist(morecvutils) \
python3dist(morecvutils)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
gstreamer-plugins-good \
python(abi) \
python3-imageio \
python3-imageio-ffmpeg \
python3-numpy \
python3-opencv"

inherit rpm
