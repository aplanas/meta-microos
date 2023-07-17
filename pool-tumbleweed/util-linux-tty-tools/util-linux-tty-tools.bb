SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "util-linux-tty-tools-2.39-2.1.aarch64.rpm"
RPM_HASH = "7bfdea8d3c328dbb8b2e040e4422c251fa842676ec5cb33d9c521dc9fec25ffef67dad7c28259b911c90b4211cb41787afd4043f7d2f247b08fc72ab6734a2d8"

RPROVIDES:${PN} += "util-linux-/usr/bin/mesg \
util-linux-/usr/bin/wall \
util-linux-/usr/bin/write \
util-linux-tty-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tty \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
