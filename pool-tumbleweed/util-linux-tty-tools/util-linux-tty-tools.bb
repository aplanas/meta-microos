SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "util-linux-tty-tools-2.39-1.1.aarch64.rpm"
RPM_HASH = "31afbb26808c64b0d34e15312ccecdbbaa3f413738019f49bba2af1ad5596d1ca948410c495cf748b93cdb387a60285dd3a0ec7c78f0cdc326b6d2abeea77ea5"

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
