SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "util-linux-tty-tools-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "a8c278bb531affacc0a693f328c12aa7bf92b7637ec035f6a79a58e3801b06cffbb49c54a6114a9690dea49b2b8c600aba49a492349c5346c21e18940596154f"

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
