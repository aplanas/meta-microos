SUMMARY = "Generic Linux input driver for the Xorg X server -- Development Files"
DESCRIPTION = "evdev is an Xorg input driver for Linux's generic event devices. It \
therefore supports all input devices that the kernel knows about, \
including most mice, keyboards, tablets and touchscreens."
LICENSE = "MIT"

PV = "2.10.6"

RPM_NAME = "xf86-input-evdev-devel-2.10.6-3.11.aarch64.rpm"
RPM_HASH = "381bc3fd46a511fce485141c30fbef74b38353e60cdf3a0e91c936802c7845f7fca0fc6d13ffe02b34d4cac3e088028b309f2c1ae82e42d2d73c3c340b81b118"

RPROVIDES:${PN} += "pkgconfig-xorg-evdev \
xf86-input-evdev-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-evdev"

inherit rpm
