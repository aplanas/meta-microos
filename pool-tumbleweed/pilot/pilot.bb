SUMMARY = "Simple file system browser"
DESCRIPTION = "Pilot is a simple, display-oriented file system browser based on the \
Pine message system composer. As with Pine, commands are displayed at \
the bottom of the screen, and context-sensitive help is provided."
LICENSE = "Apache-2.0"

PV = "2.99"

RPM_NAME = "pilot-2.99-27.4.aarch64.rpm"
RPM_HASH = "47a43f43767105784d69b014db6b3c342f0dfd648ba39b9e04d54ad1b1b3af7bae5e00a8bba8c6a07a4c3186a6726b87ea1a3e1e2d64cb86a123a66e95986f43"

RPROVIDES:${PN} += "pilot \
pilot(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
