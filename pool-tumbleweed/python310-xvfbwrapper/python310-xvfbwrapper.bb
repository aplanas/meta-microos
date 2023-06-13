SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.9"

RPM_NAME = "python310-xvfbwrapper-0.2.9-7.9.noarch.rpm"
RPM_HASH = "24234e94b3c53e4af02999e6791f7b7b66984850100c1678c23faf6860e151f85cf1cdf7aeeff75515455aa5cda4973039cbb1c42a64ba1564f200f3ef2eb10e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xvfbwrapper \
python3.10dist(xvfbwrapper) \
python310-xvfbwrapper \
python3dist(xvfbwrapper)"

RDEPENDS:${PN} += "python(abi) \
xorg-x11-Xvfb"

inherit rpm
