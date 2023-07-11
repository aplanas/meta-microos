SUMMARY = "Support daemon for hardware random device"
DESCRIPTION = "This  daemon  feeds data from a random number generator to the kernel's \
random  number  entropy  pool,  after	first checking the data to \
ensure that it is properly random."
LICENSE = "GPL-3.0-or-later"

PV = "6.16"

RPM_NAME = "rng-tools-6.16-1.2.aarch64.rpm"
RPM_HASH = "54bb9d1e8e85d37aee65f6742db2df2a4e9bbcb03d7fae32ddaa8e91e57506ba0eede87c1be8189b1345b42f41c3e9bc68d7ed52f79707a4c94c7bf65c86dcb5"

RPROVIDES:${PN} += "rng-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libp11.so.3 \
opensc \
systemd"

inherit rpm
