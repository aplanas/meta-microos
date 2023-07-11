SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.9"

RPM_NAME = "python311-xvfbwrapper-0.2.9-7.10.noarch.rpm"
RPM_HASH = "e6d59b03c7dce6741e5735a0af80227a2ea1171d02f4d5bf15e0d7fec959752ca3f7be0a8dd676130702ea5f8aedc59649872b6bc9f38e6fce1a7a4cb2ae3433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xvfbwrapper \
python3.11dist-xvfbwrapper \
python311-xvfbwrapper \
python3dist-xvfbwrapper"

RDEPENDS:${PN} += "python-abi \
xorg-x11-Xvfb"

inherit rpm
