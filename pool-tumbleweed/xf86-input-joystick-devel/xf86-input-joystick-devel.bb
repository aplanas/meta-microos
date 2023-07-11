SUMMARY = "Joystick input driver for the Xorg X server -- Development Files"
DESCRIPTION = "joystick is an Xorg input driver for Joysticks. The driver reports \
cursor movement as well as raw axis values through valuators."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xf86-input-joystick-devel-1.6.4-1.3.aarch64.rpm"
RPM_HASH = "6fc92455ff59e1c5caf826fc915a76d0843259321843364c764b2b6fa58417defc1e5bd5cbad6c86f77130765f17db66dca155bc0900efab439c66dc150df478"

RPROVIDES:${PN} += "pkgconfig-xorg-joystick \
xf86-input-joystick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-joystick"

inherit rpm
