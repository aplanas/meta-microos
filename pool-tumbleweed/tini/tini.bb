SUMMARY = "A tiny but valid init for containers"
DESCRIPTION = "Tini is a trivial implementation for an 'init' program. \
 \
All Tini does is spawn a single child (Tini is meant to be run in a container), \
and wait for it to exit, all the while reaping zombies and performing signal forwarding. \
 \
libc will be needed inside the container."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "tini-0.19.0-2.2.aarch64.rpm"
RPM_HASH = "57fbbeaea9691a52a225583f8bb0d9b0866f301b05b1ec8374423918065fb3eda5f42fc6c707a1544d342224d5eeed21aa963087204d687de206f3475a373f21"

RPROVIDES:${PN} += "tini"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
