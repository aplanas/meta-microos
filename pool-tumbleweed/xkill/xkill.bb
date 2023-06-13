SUMMARY = "Utility to kill a client by its X resource"
DESCRIPTION = "xkill is a utility for forcing the X server to close connections to \
clients. This program is very dangerous, but is useful for aborting \
programs that have displayed undesired windows on a user's screen."
LICENSE = "X11"

PV = "1.0.6"

RPM_NAME = "xkill-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "14912740d28f3d53968e62457b23fde4e4e9cafbf06bdeeb28ed0a65cce2a4a0df0ad9055107f2384e0f05a508e967ce84f2891cce363b67084daa0c1c3b739c"

RPROVIDES:${PN} += "application() \
application(xkill.desktop) \
xkill \
xkill(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXmuu.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
