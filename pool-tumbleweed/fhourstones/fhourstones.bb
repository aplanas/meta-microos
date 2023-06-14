SUMMARY = "The Fhourstones Benchmark"
DESCRIPTION = "This integer benchmark solves positions in the game of connect-4, as played \
on a vertical 7x6 board."
LICENSE = "BSD-2-Clause"

PV = "3.1+git.20150122"

RPM_NAME = "fhourstones-3.1+git.20150122-2.9.aarch64.rpm"
RPM_HASH = "9ff6b663e179cd8ae22328fd4ab8b013f1d60b82e2374dab755125b8a4acf582d4b9189d61b1c0f3ab1f543de79574e705e8b11e199302912b8d47009cf8f36f"

RPROVIDES:${PN} += "fhourstones"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
