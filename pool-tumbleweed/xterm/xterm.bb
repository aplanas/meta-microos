SUMMARY = "The basic X terminal program"
DESCRIPTION = " \
This package contains the basic X.Org terminal program desktop launcher."
LICENSE = "MIT"

PV = "382"

RPM_NAME = "xterm-382-1.1.aarch64.rpm"
RPM_HASH = "94cc0517819c51bbcee425ac83481b3264a4c454da1f597f69a0418a09849f49c1b9484ea2ef33a037fc9805f2e1c046628b4c5915f80126fb66d4a021c617b3"

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
