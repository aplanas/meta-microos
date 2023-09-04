SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "util-linux-tty-tools-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "b0fde6cbd0a0cd89e9ee29239e63cdcc38e696e24a7c4f1b8e08491895f9453fe5df19c1e67d0b7a9075fe09cfabf79b49294702b0af27ea8bba6a682b513411"

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
