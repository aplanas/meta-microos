SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.9"

RPM_NAME = "python311-xvfbwrapper-0.2.9-7.9.noarch.rpm"
RPM_HASH = "cd0d4fcceeb593647f50439782ee3acc86b7942db279d2ade00b5f18e01bcd5c23f09ead93c1ce51b191f61a9ee3c4a9004ea9ee2212739a4789ed2c4b0a6eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xvfbwrapper) \
python311-xvfbwrapper \
python3dist(xvfbwrapper)"

RDEPENDS:${PN} += "python(abi) \
xorg-x11-Xvfb"

inherit rpm
