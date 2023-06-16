SUMMARY = "Synaptics touchpad input driver for the Xorg X server"
DESCRIPTION = "synaptics is an Xorg input driver for touchpads. \
 \
Even though touchpads can be handled by the normal evdev or mouse \
drivers, this driver allows more advanced features of the touchpad to \
become available."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "xf86-input-synaptics-1.9.2-1.3.aarch64.rpm"
RPM_HASH = "c8672483131124176898f82154465d8eecd36358519e8713ff839d39a340fbdc3ab706b81803c7838241af5089e172f797c68f99dc98132b373c0cead366a4c2"

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
