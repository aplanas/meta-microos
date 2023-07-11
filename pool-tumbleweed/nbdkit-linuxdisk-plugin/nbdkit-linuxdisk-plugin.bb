SUMMARY = "Virtual Linux disk plugin for nbdkit"
DESCRIPTION = "This package is a virtual Linux disk plugin for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-linuxdisk-plugin-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "9ce9d93db952ca4feb7aae46a4402324848528de6572b768c0b2797f8ae7808f0936a72bef676dc78ae6502c1cce37969c46b93037155488e5e302281658fba3"

RPROVIDES:${PN} += "nbdkit-linuxdisk-plugin"

RDEPENDS:${PN} += "e2fsprogs \
ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server"

inherit rpm
