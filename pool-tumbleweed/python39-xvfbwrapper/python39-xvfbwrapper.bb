SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.9"

RPM_NAME = "python39-xvfbwrapper-0.2.9-7.10.noarch.rpm"
RPM_HASH = "f3aa496338c8d0db0d4eae070038f2b92a31f6731d09729486150bd01b46b3bae85c768b3bc485a07d3a9e46991612ab1b64ce41284f9c27a2823461a86f1614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xvfbwrapper \
python39-xvfbwrapper \
python3dist-xvfbwrapper"

RDEPENDS:${PN} += "python-abi \
xorg-x11-Xvfb"

inherit rpm
