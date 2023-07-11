SUMMARY = "Joystick input driver for the Xorg X server"
DESCRIPTION = "joystick is an Xorg input driver for Joysticks. The driver reports \
cursor movement as well as raw axis values through valuators."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xf86-input-joystick-1.6.4-1.3.aarch64.rpm"
RPM_HASH = "fe44a64ea54b180f6b10d7695d26d04187463fb82d83867026f68d07953d32111518d8406f86aaeb472533931a861e1b0738fe6747a1bd77dd793e926e0fd36a"

RPROVIDES:${PN} += "xf86-input-joystick"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
