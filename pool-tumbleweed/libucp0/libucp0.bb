SUMMARY = "Infiniband Unified Communication Protocols"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libucp0-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "ece0ed92d95aef94b56de46acaa9a33ee41c114983867ee34e3df25a8e9ad413199e81411d65373068b274855f2c2d9260d340aea7562debbeb2b109f6c1e1b2"

RPROVIDES:${PN} += "libucp.so.0 \
libucp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libucs.so.0 \
libuct.so.0"

inherit rpm
