SUMMARY = "An implementation of the DVMRP multicast routing protocol"
DESCRIPTION = "Mrouted is an implementation of the Distance-Vector Multicast Routing \
Protocol (DVMRP), an earlier version of which is specified in RFC-1075. \
 \
Mrouted turns a UNIX workstation into a DVMRP multicast router with tunnel \
support, in order to cross non-multicast-aware routers.  The tunnels are \
virtual point-to-point, IP-IP tunnel, links between a pair of mrouted routers."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "4.4"

RPM_NAME = "mrouted-4.4-1.9.aarch64.rpm"
RPM_HASH = "26af4980905ec5f02076b750d6446519bb1a5afedb33a0e13362d0f3d52431d659e6832f7d7ad4e00320c69b515adb6f67f644d6cc7fa326c1f948de102e3fb6"

RPROVIDES:${PN} += "config-mrouted \
mrouted"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
