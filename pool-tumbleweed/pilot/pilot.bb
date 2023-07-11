SUMMARY = "Simple file system browser"
DESCRIPTION = "Pilot is a simple, display-oriented file system browser based on the \
Pine message system composer. As with Pine, commands are displayed at \
the bottom of the screen, and context-sensitive help is provided."
LICENSE = "Apache-2.0"

PV = "2.99"

RPM_NAME = "pilot-2.99-27.5.aarch64.rpm"
RPM_HASH = "703ca947d6739e8ed5792260bb1c41e09f56e8c27e13f3bef225b9e42044fe2d15806ca27e1bb7db912162ce592bc7ecd90957975428a03dfaca878df29133bc"

RPROVIDES:${PN} += "pilot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
