SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "vncmanager-controller-gnome-1.0.2-1.1.noarch.rpm"
RPM_HASH = "434b603f84e971bb2d26376057a11457c4d3165a341fb05675bc83e6ccd34af723c1ef08e4a68f1c1ba09925539d90b6ca1f7f7f7fefd79dc9858246e5d7dbbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vncmanager-controller-gnome"

RDEPENDS:${PN} += "gnome-shell \
vncmanager-controller"

inherit rpm
