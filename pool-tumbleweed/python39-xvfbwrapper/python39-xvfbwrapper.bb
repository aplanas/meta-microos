SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.9"

RPM_NAME = "python39-xvfbwrapper-0.2.9-7.9.noarch.rpm"
RPM_HASH = "834f7b185c7ae1792c3797fed425732a5ba2e131b3b8580c9717b264f3fee0b6e4a03f420f0aa702b501495150cd16fafbce0fa9e0729cc11129206be46cd4c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xvfbwrapper) \
python39-xvfbwrapper \
python3dist(xvfbwrapper)"

RDEPENDS:${PN} += "python(abi) \
xorg-x11-Xvfb"

inherit rpm
