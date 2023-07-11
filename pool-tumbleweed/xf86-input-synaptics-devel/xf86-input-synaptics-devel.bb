SUMMARY = "Synaptics touchpad input driver for the Xorg X server -- Development Files"
DESCRIPTION = "synaptics is an Xorg input driver for touchpads. \
 \
Even though touchpads can be handled by the normal evdev or mouse \
drivers, this driver allows more advanced features of the touchpad to \
become available."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "xf86-input-synaptics-devel-1.9.2-1.4.aarch64.rpm"
RPM_HASH = "49fbeb58237541988d67079fadbed74f930613e26ff6972cb7a40bcdbfa26890d8a346025a777f514e6026012c68cb1d75b86e93c7fb51d61cab7c9c609babd4"

RPROVIDES:${PN} += "pkgconfig-xorg-synaptics \
xf86-input-synaptics-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
