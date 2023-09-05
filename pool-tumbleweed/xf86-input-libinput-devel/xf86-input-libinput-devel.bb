SUMMARY = "Libinput driver for the Xorg X server -- Development Files"
DESCRIPTION = "xf86-input-libinput is a libinput-based X.Org driver. The actual driver bit \
is quite limited, most of the work is done by libinput, the driver itself \
passes on the events (and wrangles them a bit where needed)."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "xf86-input-libinput-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "50abaae6e56cfc9b82f84db1e11f66bf1c000241bcdc4e1020df9c819d429ee1e1826a19f7e4660dc2ef3f43167c19126146bd06252cea7ac80f88cb11315fac"

RPROVIDES:${PN} += "pkgconfig-xorg-libinput \
xf86-input-libinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-libinput"

inherit rpm
