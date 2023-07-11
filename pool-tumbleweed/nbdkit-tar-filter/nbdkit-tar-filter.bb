SUMMARY = "Tar archive filter for nbdkit"
DESCRIPTION = "This package is a tar archive filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-tar-filter-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "ff6526b4c50a5c282f27341e1a4d99e465dbdd1cecd1b7beef43ce8d7d4103a3b80d756af020a0b2b5a075e7139829ceb5438646c03fcb82de0b1701d234f4e2"

RPROVIDES:${PN} += "nbdkit-tar-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server \
tar"

inherit rpm
