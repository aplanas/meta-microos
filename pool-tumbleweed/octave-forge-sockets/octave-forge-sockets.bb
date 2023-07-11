SUMMARY = "Socket Octave functions for networking"
DESCRIPTION = "Socket functions for networking. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "octave-forge-sockets-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "1405fc2507dda7e35aafd825cc8e90e7fe9167a753a0e05494eeaf80516aa8e2b51f6cf665fe6276cb80c938158d953e5d2e4045eac8fc41e31c72022e272dd7"

RPROVIDES:${PN} += "octave-forge-sockets"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
