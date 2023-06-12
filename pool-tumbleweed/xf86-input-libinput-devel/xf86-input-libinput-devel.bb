SUMMARY = "Libinput driver for the Xorg X server -- Development Files"
DESCRIPTION = "xf86-input-libinput is a libinput-based X.Org driver. The actual driver bit \
is quite limited, most of the work is done by libinput, the driver itself \
passes on the events (and wrangles them a bit where needed)."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "xf86-input-libinput-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "ac6b8d77339cac84e35ffdc537b0d87fba9965f46c2a512a404e19aa1be7acc76b47024c75736c7dbdce12672a014169029e61a58f9d9b76b5a6ab250124e7a5"

RPROVIDES:${PN} += "pkgconfig(xorg-libinput) \
xf86-input-libinput-devel \
xf86-input-libinput-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-libinput"

inherit rpm
