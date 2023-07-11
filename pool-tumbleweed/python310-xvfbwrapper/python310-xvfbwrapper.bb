SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.9"

RPM_NAME = "python310-xvfbwrapper-0.2.9-7.10.noarch.rpm"
RPM_HASH = "77c0aab52cc5b5b67334afd28c4f1e2ac1bb79bfdf978d5a2ce005e0a8bc72e4c7bc17fc48867c62222ec4e25cc28798e7281a4bc5f3a88990eec57fc60f8ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xvfbwrapper \
python310-xvfbwrapper \
python3dist-xvfbwrapper"

RDEPENDS:${PN} += "python-abi \
xorg-x11-Xvfb"

inherit rpm
