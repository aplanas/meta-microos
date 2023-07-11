SUMMARY = "Debuginfo extraction"
DESCRIPTION = "debugedit provides programs and scripts for creating debuginfo and source file distributions, \
collect build-ids and rewrite source paths in DWARF data for debugging, tracing and profiling."
LICENSE = "GPL-3.0-or-later"

PV = "5.0"

RPM_NAME = "debugedit-5.0-5.5.aarch64.rpm"
RPM_HASH = "836d7cda59ce72f57f8d7fc4aa15a1308d20446b886da050e845b1cc8da2cff25c5f2058cd292c559ab4440a88c227442be930c81dfe0bd0abaf0ede439058a9"

RPROVIDES:${PN} += "debugedit"

RDEPENDS:${PN} += "/usr/bin/bash \
binutils \
coreutils \
dwz \
elfutils \
findutils \
gawk \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
sed \
xz"

inherit rpm
