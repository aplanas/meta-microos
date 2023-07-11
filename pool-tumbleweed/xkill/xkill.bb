SUMMARY = "Utility to kill a client by its X resource"
DESCRIPTION = "xkill is a utility for forcing the X server to close connections to \
clients. This program is very dangerous, but is useful for aborting \
programs that have displayed undesired windows on a user's screen."
LICENSE = "X11"

PV = "1.0.6"

RPM_NAME = "xkill-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "0671f23bf953254052657a7a3b7e4380c59811b2b0ab790735327b4a6c91b2958a516693aa3a04f037967db9dc47007955de5db3bdb9b59711e73fc1c5ff4b86"

RPROVIDES:${PN} += "xkill"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
