SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "util-linux-tty-tools-2.39-3.1.aarch64.rpm"
RPM_HASH = "611532a4db797ca15154d2461e02b325f168027249ea6840349948f74a6b99c748943ec84c17b8c1c7629df27b087aa82bdb4d6cf77d96aa712b91ba3d78ccc4"

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
