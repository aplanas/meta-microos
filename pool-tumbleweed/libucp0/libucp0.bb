SUMMARY = "Infiniband Unified Communication Protocols"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucp0-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "d829769cf214f3819685be55bc00ba73c7ead5cf4b1c233a1e0a355c2d1fd00a2cd39d05ba584a90e200dd1194dba1b2a0e7f408db23671c1dafc718bd5997a1"

RPROVIDES:${PN} += "libucp.so.0 \
libucp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libucs.so.0 \
libuct.so.0"

inherit rpm
