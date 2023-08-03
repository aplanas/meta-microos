SUMMARY = "Utility to set/clear/query executable stack bit"
DESCRIPTION = "This package is built from prelink sources but contains just the \
execstack binary. It can be used to manipulate ELF binaries to run \
with or without executable stack."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "execstack-0.5.0-3.1.aarch64.rpm"
RPM_HASH = "ec0f34a1326390d5d99e90c22e71631d71c45bf9e55c730406fdd6ff9f9e971ed8dd26006d6da1b59fd2a48d4ca39701ea18bb87fc040feae9f00a731cec39fc"

RPROVIDES:${PN} += "execstack"

RDEPENDS:${PN} += "coreutils \
findutils \
gawk \
glibc \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libselinux.so.1 \
util-linux"

inherit rpm
