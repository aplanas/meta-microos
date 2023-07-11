SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "vncmanager-controller-gnome-1.0.1-6.8.aarch64.rpm"
RPM_HASH = "534fdf590d1ee7caa59a906a5b0790c8072a5600472c21d4be9ba52b209730f738ebb3fa7762f94b67cd9fb5764594ad4f50d3331d103815ce85a689b46dabb8"

RPROVIDES:${PN} += "vncmanager-controller-gnome"

RDEPENDS:${PN} += "gnome-shell \
vncmanager-controller"

inherit rpm
