SUMMARY = "Mouse input driver for the Xorg X server"
DESCRIPTION = "mouse is an Xorg input driver for mice. The driver supports most \
available mouse types and interfaces, though the level of support for \
types of mice depends on the OS."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "xf86-input-mouse-1.9.5-1.1.aarch64.rpm"
RPM_HASH = "a2b2e4082f5fad3b5a2de47637a3d3bb74b6652acc6edd5b5b9891fcf292dccbcebd0c657bb5ec36449ba816c7e69edf858df541d4ebc67999c1f7c6f72a7db7"

RPROVIDES:${PN} += "xf86-input-mouse"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
