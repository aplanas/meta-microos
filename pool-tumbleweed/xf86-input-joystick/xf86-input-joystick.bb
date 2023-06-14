SUMMARY = "Joystick input driver for the Xorg X server"
DESCRIPTION = "joystick is an Xorg input driver for Joysticks. The driver reports \
cursor movement as well as raw axis values through valuators."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xf86-input-joystick-1.6.4-1.2.aarch64.rpm"
RPM_HASH = "5f1c26fab74327d226be2b1db4e851cb37a1623d246ce78150f61b3dba4d97ca350586b7ad56b78b97e4b526ee810a147b622f40bc27c166205b3b38cbc5f338"

RPROVIDES:${PN} += "xf86-input-joystick"

RDEPENDS:${PN} += "/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
