SUMMARY = "Synaptics touchpad input driver for the Xorg X server"
DESCRIPTION = "synaptics is an Xorg input driver for touchpads. \
 \
Even though touchpads can be handled by the normal evdev or mouse \
drivers, this driver allows more advanced features of the touchpad to \
become available."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "xf86-input-synaptics-1.9.2-1.4.aarch64.rpm"
RPM_HASH = "b44887fdda8744119bf74a45563cabe251a31153d83877887292b22f314e832135c21e570d2f24df30cafee8a1ea4616fef4d89df6dcb230cfa34d2cce1124ff"

RPROVIDES:${PN} += "x11-input-synaptics \
xf86-input-synaptics"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libevdev.so.2 \
libm.so.6 \
udev"

inherit rpm
