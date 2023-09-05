SUMMARY = "An implementation of the DVMRP multicast routing protocol"
DESCRIPTION = "Mrouted is an implementation of the Distance-Vector Multicast Routing \
Protocol (DVMRP), an earlier version of which is specified in RFC-1075. \
 \
Mrouted turns a UNIX workstation into a DVMRP multicast router with tunnel \
support, in order to cross non-multicast-aware routers.  The tunnels are \
virtual point-to-point, IP-IP tunnel, links between a pair of mrouted routers."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "4.5"

RPM_NAME = "mrouted-4.5-1.1.aarch64.rpm"
RPM_HASH = "3109f3d4d93f936b4addde14d4244d52034ffc39e2b709cc551db550e5468af11170df431829546e830d6347dd201ab0ac94544e4df1f0101c3b39aebfd776dc"

RPROVIDES:${PN} += "config-mrouted \
mrouted"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
