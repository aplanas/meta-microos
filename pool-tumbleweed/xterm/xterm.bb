SUMMARY = "The basic X terminal program"
DESCRIPTION = " \
This package contains the basic X.Org terminal program desktop launcher."
LICENSE = "MIT"

PV = "384"

RPM_NAME = "xterm-384-1.1.aarch64.rpm"
RPM_HASH = "2228082ae3e7dab4bbb891197e38bd8812042a25b729dbff68b874a3f9ff78030aae92b3dea4838d19c886a88a24125d1ec51ced7df11ea7d1c105d88a2edd6f"

RPROVIDES:${PN} += "XFree86-/usr/X11R6/bin/xterm \
xorg-x11-/usr/X11R6/bin/xterm \
xterm"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
luit \
perl \
xterm-bin"

inherit rpm
